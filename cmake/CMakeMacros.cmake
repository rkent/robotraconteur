
function(RRSetTargetDirs target bindir libdir)

set_target_properties(${target} PROPERTIES ARCHIVE_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/out/${libdir}")
set_target_properties(${target} PROPERTIES ARCHIVE_OUTPUT_DIRECTORY_DEBUG "${CMAKE_BINARY_DIR}/out_debug/${libdir}")
set_target_properties(${target} PROPERTIES ARCHIVE_OUTPUT_DIRECTORY_RELEASE "${CMAKE_BINARY_DIR}/out/${libdir}")
set_target_properties(${target} PROPERTIES ARCHIVE_OUTPUT_DIRECTORY_RELWITHDEBINFO "${CMAKE_BINARY_DIR}/out_reldebug/${libdir}")

set_target_properties(${target} PROPERTIES RUNTIME_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/out/${bindir}")
set_target_properties(${target} PROPERTIES RUNTIME_OUTPUT_DIRECTORY_DEBUG "${CMAKE_BINARY_DIR}/out_debug/${bindir}")
set_target_properties(${target} PROPERTIES RUNTIME_OUTPUT_DIRECTORY_RELEASE "${CMAKE_BINARY_DIR}/out/${bindir}")
set_target_properties(${target} PROPERTIES RUNTIME_OUTPUT_DIRECTORY_RELWITHDEBINFO "${CMAKE_BINARY_DIR}/out_reldebug/${bindir}")

set_target_properties(${target} PROPERTIES LIBRARY_OUTPUT_DIRECTORY "${CMAKE_BINARY_DIR}/out/${libdir}")
set_target_properties(${target} PROPERTIES LIBRARY_OUTPUT_DIRECTORY_DEBUG "${CMAKE_BINARY_DIR}/out_debug/${libdir}")
set_target_properties(${target} PROPERTIES LIBRARY_OUTPUT_DIRECTORY_RELEASE "${CMAKE_BINARY_DIR}/out/${libdir}")
set_target_properties(${target} PROPERTIES LIBRARY_OUTPUT_DIRECTORY_RELWITHDEBINFO "${CMAKE_BINARY_DIR}/out_reldebug/${libdir}")

endfunction()

# https://stackoverflow.com/questions/148570/using-pre-compiled-headers-with-cmake
MACRO(ADD_MSVC_PRECOMPILED_HEADER PrecompiledHeader PrecompiledSource SourcesVar)
  IF(MSVC)
    GET_FILENAME_COMPONENT(PrecompiledBasename ${PrecompiledHeader} NAME_WE)
    SET(PrecompiledBinary "$(IntDir)/${PrecompiledBasename}.pch")
    SET(Sources ${${SourcesVar}})

    SET_SOURCE_FILES_PROPERTIES(${PrecompiledSource}
                                PROPERTIES COMPILE_FLAGS "/Yc\"${PrecompiledHeader}\" /Fp\"${PrecompiledBinary}\""
                                           OBJECT_OUTPUTS "${PrecompiledBinary}")
    SET_SOURCE_FILES_PROPERTIES(${Sources}
                                PROPERTIES COMPILE_FLAGS "/Yu\"${PrecompiledHeader}\" /FI\"${PrecompiledHeader}\" /Fp\"${PrecompiledBinary}\""
                                           OBJECT_DEPENDS "${PrecompiledBinary}")  
    # Add precompiled header to SourcesVar
    LIST(APPEND ${SourcesVar} ${PrecompiledSource})
  ENDIF(MSVC)
ENDMACRO(ADD_MSVC_PRECOMPILED_HEADER)

function(RRConfigureTest test_name cmd template_in)
cmake_parse_arguments(RRConfigureTest "NOCTEST;NODEBUG" "FILELIST;ARGS" "" ${ARGN})

set(OUT_DIR_NAME_LIST "out;out_reldebug;out_debug")
foreach(OUT_DIR_NAME ${OUT_DIR_NAME_LIST})
string(CONFIGURE "${cmd}" abs_cmd1 @ONLY)
file(TO_NATIVE_PATH "${abs_cmd1}" ROBOTRACONTEUR_TEST_CMD)
string(CONFIGURE "${RRConfigureTest_ARGS}" ROBOTRACONTEUR_TEST_ARGS @ONLY)
if(RRConfigureTest_FILELIST)
string(CONFIGURE "${${RRConfigureTest_FILELIST}}" ROBOTRACONTEUR_TEST_GEN_FILE_LIST @ONLY)
#file(TO_NATIVE_PATH "${filelist1}" ROBOTRACONTEUR_TEST_GEN_FILE_LIST)
endif()
set(ROBOTRACONTEUR_CORE_BIN_DIR ${CMAKE_BINARY_DIR}/${OUT_DIR_NAME}/bin)
set(ROBOTRACONTEUR_CORE_LIB_DIR ${CMAKE_BINARY_DIR}/${OUT_DIR_NAME}/lib)
if(WIN32)
configure_file("${CMAKE_SOURCE_DIR}/testing/templates/${template_in}.bat.in" "${CMAKE_BINARY_DIR}/${OUT_DIR_NAME}/test/${test_name}.bat" @ONLY)
else()
configure_file("${CMAKE_SOURCE_DIR}/testing/templates/${template_in}.in" "${CMAKE_BINARY_DIR}/${OUT_DIR_NAME}/test/${test_name}" @ONLY)
endif()
endforeach()
if(WIN32)
if(NOT RRConfigureTest_NOCTEST)
if(NOT RRConfigureTest_NODEBUG)
add_test(NAME ${test_name} COMMAND "${CMAKE_BINARY_DIR}/out_debug/test/${test_name}.bat" CONFIGURATIONS Debug WORKING_DIRECTORY "${CMAKE_BINARY_DIR}/out_debug/test")
endif()
add_test(NAME "${test_name}_rel" COMMAND "${CMAKE_BINARY_DIR}/out/test/${test_name}.bat" CONFIGURATIONS Release WORKING_DIRECTORY "${CMAKE_BINARY_DIR}/out/test")
add_test(NAME "${test_name}_reldeb" COMMAND "${CMAKE_BINARY_DIR}/out_reldebug/test/${test_name}.bat" CONFIGURATIONS RelWithDebInfo WORKING_DIRECTORY "${CMAKE_BINARY_DIR}/out_reldebug/test")
endif()
else()
if(NOT RRConfigureTest_NOCTEST)
if(NOT RRConfigureTest_NODEBUG)
add_test(NAME ${test_name} COMMAND "${CMAKE_BINARY_DIR}/out_debug/test/${test_name}" CONFIGURATIONS Debug WORKING_DIRECTORY "${CMAKE_BINARY_DIR}/out_debug/test")
endif()
add_test(NAME "${test_name}_rel" COMMAND "${CMAKE_BINARY_DIR}/out/test/${test_name}" CONFIGURATIONS Release WORKING_DIRECTORY "${CMAKE_BINARY_DIR}/out/test")
add_test(NAME "${test_name}_reldeb" COMMAND "${CMAKE_BINARY_DIR}/out_reldebug/test/${test_name}" CONFIGURATIONS RelWithDebInfo WORKING_DIRECTORY "${CMAKE_BINARY_DIR}/out_reldebug/test")
endif()
endif()
endfunction()
