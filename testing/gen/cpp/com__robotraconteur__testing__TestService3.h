//This file is automatically generated. DO NOT EDIT!

#include <RobotRaconteur.h>
#include <boost/signals2.hpp>
#include <boost/array.hpp>
#include <boost/container/static_vector.hpp>
#include "com__robotraconteur__testing__TestService1.h"
#pragma once

namespace com
{
namespace robotraconteur
{
namespace testing
{
namespace TestService3
{

class teststruct3;
class testroot3;
class obj1;
class obj2;
class obj3;
class obj4;

namespace com__robotraconteur__testing__TestService3Constants 
{
    static const char* strconst="This is a\n \"string constant\" \\/\b\f \r\xc3\xbf tabme\ttabme\n smile! \xf0\x9f\x98\x81";
    static const int32_t int32const=3856384;
    static const int32_t int32const_array[]={182476, 56483, -2947};
    static const double doubleconst_array[]={1.5847, 3.14, -548e3, 3452.67e2, 485e-21};
    namespace structconst { static const char* strconst="This is a\n \"string constant\" \\/\b\f \r\xc3\xbf tabme\ttabme\n smile! \xf0\x9f\x98\x81"; static const int32_t int32const_array[]={182476, 56483, -2947}; }
    namespace structconst2 { namespace structconst { static const char* strconst="This is a\n \"string constant\" \\/\b\f \r\xc3\xbf tabme\ttabme\n smile! \xf0\x9f\x98\x81"; static const int32_t int32const_array[]={182476, 56483, -2947}; } static const int32_t int32const=3856384; }
}
    namespace testenum1
    {
    enum testenum1
    {
    value1 = 0,
    value2 = 1,
    value3 = 2,
    anothervalue = -1,
    anothervalue2 = -2,
    anothervalue3 = -3,
    hexval1 = 0x10,
    hexval2 = 0x11,
    neghexval1 = 0x80000005,
    neghexval2 = 0x80000006,
    more_values = 0x80000007
    };
    }

class testcstruct2 : public RobotRaconteur::RRCStructure {
public:
int8_t i1;
RobotRaconteur::cstructure_field_array<int8_t,15,false> i2;
RobotRaconteur::cstructure_field_array<int8_t,17,true> i3;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.testcstruct2";  }
};

class testcstruct1 : public RobotRaconteur::RRCStructure {
public:
double d1;
RobotRaconteur::cstructure_field_array<double,6,false> d2;
RobotRaconteur::cstructure_field_array<double,6,true> d3;
RobotRaconteur::cstructure_field_array<double,9,false> d4;
testcstruct2 s1;
RobotRaconteur::cstructure_field_array<testcstruct2,8,false> s2;
RobotRaconteur::cstructure_field_array<testcstruct2,9,true> s3;
RobotRaconteur::cstructure_field_array<testcstruct2,8,false> s4;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.testcstruct1";  }
};

class teststruct3 : public RobotRaconteur::RRStructure {
public:
testcstruct1 s1;
RR_SHARED_PTR<RobotRaconteur::RRCStructureArray<testcstruct1> > s2;
RR_SHARED_PTR<RobotRaconteur::RRCStructureArray<testcstruct1> > s3;
RR_SHARED_PTR<RobotRaconteur::RRCStructureArray<testcstruct1> > s4;
RR_SHARED_PTR<RobotRaconteur::RRCStructureMultiDimArray<testcstruct1> > s5;
RR_SHARED_PTR<RobotRaconteur::RRCStructureMultiDimArray<testcstruct1> > s6;
RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRCStructureArray<testcstruct1>  > > s7;
RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRCStructureArray<testcstruct1>  > > s8;
RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRCStructureMultiDimArray<testcstruct1>  > > s9;
RR_SHARED_PTR<RobotRaconteur::RRValue> s10;
RR_SHARED_PTR<RobotRaconteur::RRValue> s11;
RR_SHARED_PTR<RobotRaconteur::RRValue> s12;
RR_SHARED_PTR<RobotRaconteur::RRValue> s13;
RR_SHARED_PTR<RobotRaconteur::RRValue> s14;
RR_SHARED_PTR<RobotRaconteur::RRValue> s15;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.teststruct3";  }
};

class testroot3 : public virtual RobotRaconteur::RRObject
{
public:
virtual int32_t get_readme()=0;

virtual void set_writeme(int32_t value)=0;

virtual int32_t get_unknown_modifier()=0;
virtual void set_unknown_modifier(int32_t value)=0;

virtual testenum1::testenum1 get_testenum1_prop()=0;
virtual void set_testenum1_prop(testenum1::testenum1 value)=0;

virtual testcstruct1 get_testcstruct1_prop()=0;
virtual void set_testcstruct1_prop(const testcstruct1& value)=0;

virtual RR_SHARED_PTR<teststruct3 > get_teststruct3_prop()=0;
virtual void set_teststruct3_prop(RR_SHARED_PTR<teststruct3 > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRArray<double >  > > get_d1()=0;
virtual void set_d1(RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRArray<double >  > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRArray<double >  > > get_d2()=0;
virtual void set_d2(RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRArray<double >  > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::RRMap<int32_t,RobotRaconteur::RRArray<double >  > > get_d3()=0;
virtual void set_d3(RR_SHARED_PTR<RobotRaconteur::RRMap<int32_t,RobotRaconteur::RRArray<double >  > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::RRMap<int32_t,RobotRaconteur::RRArray<double >  > > get_d4()=0;
virtual void set_d4(RR_SHARED_PTR<RobotRaconteur::RRMap<int32_t,RobotRaconteur::RRArray<double >  > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRMultiDimArray<double >  > > get_d5()=0;
virtual void set_d5(RR_SHARED_PTR<RobotRaconteur::RRList<RobotRaconteur::RRMultiDimArray<double >  > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::RRMap<int32_t,RobotRaconteur::RRMultiDimArray<double >  > > get_d6()=0;
virtual void set_d6(RR_SHARED_PTR<RobotRaconteur::RRMap<int32_t,RobotRaconteur::RRMultiDimArray<double >  > > value)=0;

virtual void testcstruct1_func1(const testcstruct1& s)=0;

virtual testcstruct1 testcstruct1_func2()=0;

virtual RR_SHARED_PTR<RobotRaconteur::Generator<double,void > > gen_func1()=0;

virtual RR_SHARED_PTR<RobotRaconteur::Generator<RR_SHARED_PTR<RobotRaconteur::RRArray<uint8_t > >,void > > gen_func2(const std::string& name)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Generator<void,RR_SHARED_PTR<RobotRaconteur::RRArray<uint8_t > > > > gen_func3(const std::string& name)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Generator<RR_SHARED_PTR<RobotRaconteur::RRArray<uint8_t > >,RR_SHARED_PTR<RobotRaconteur::RRArray<uint8_t > > > > gen_func4()=0;

virtual RR_SHARED_PTR<RobotRaconteur::Generator<RR_SHARED_PTR<com::robotraconteur::testing::TestService1::teststruct2 >,RR_SHARED_PTR<com::robotraconteur::testing::TestService1::teststruct2 > > > gen_func5()=0;

virtual RR_SHARED_PTR<obj4 > get_o4()=0;

virtual RR_SHARED_PTR<RobotRaconteur::Pipe<int32_t > > get_unreliable1()=0;
virtual void set_unreliable1(RR_SHARED_PTR<RobotRaconteur::Pipe<int32_t > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Pipe<int32_t > > get_unreliable2()=0;
virtual void set_unreliable2(RR_SHARED_PTR<RobotRaconteur::Pipe<int32_t > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Pipe<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > get_p1()=0;
virtual void set_p1(RR_SHARED_PTR<RobotRaconteur::Pipe<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Pipe<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > get_p2()=0;
virtual void set_p2(RR_SHARED_PTR<RobotRaconteur::Pipe<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Pipe<RR_SHARED_PTR<RobotRaconteur::RRMultiDimArray<int32_t > > > > get_p3()=0;
virtual void set_p3(RR_SHARED_PTR<RobotRaconteur::Pipe<RR_SHARED_PTR<RobotRaconteur::RRMultiDimArray<int32_t > > > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Wire<int32_t > > get_peekwire()=0;
virtual void set_peekwire(RR_SHARED_PTR<RobotRaconteur::Wire<int32_t > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Wire<int32_t > > get_pokewire()=0;
virtual void set_pokewire(RR_SHARED_PTR<RobotRaconteur::Wire<int32_t > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Wire<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > get_w1()=0;
virtual void set_w1(RR_SHARED_PTR<RobotRaconteur::Wire<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Wire<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > get_w2()=0;
virtual void set_w2(RR_SHARED_PTR<RobotRaconteur::Wire<RR_SHARED_PTR<RobotRaconteur::RRArray<int32_t > > > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::Wire<RR_SHARED_PTR<RobotRaconteur::RRMultiDimArray<int32_t > > > > get_w3()=0;
virtual void set_w3(RR_SHARED_PTR<RobotRaconteur::Wire<RR_SHARED_PTR<RobotRaconteur::RRMultiDimArray<int32_t > > > > value)=0;

virtual RR_SHARED_PTR<RobotRaconteur::ArrayMemory<double > > get_readmem()=0;

virtual RR_SHARED_PTR<RobotRaconteur::CStructureArrayMemory<testcstruct2 > > get_cstruct_m1()=0;

virtual RR_SHARED_PTR<RobotRaconteur::CStructureMultiDimArrayMemory<testcstruct2 > > get_cstruct_m2()=0;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.testroot3";  }
};

class obj1 : public virtual RobotRaconteur::RRObject
{
public:
virtual RR_SHARED_PTR<RobotRaconteur::RRArray<double > > get_d1()=0;
virtual void set_d1(RR_SHARED_PTR<RobotRaconteur::RRArray<double > > value)=0;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.obj1";  }
};

class obj2 : public virtual obj1
{
public:
virtual RR_SHARED_PTR<RobotRaconteur::RRArray<double > > get_d1()=0;
virtual void set_d1(RR_SHARED_PTR<RobotRaconteur::RRArray<double > > value)=0;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.obj2";  }
};

class obj3 : public virtual obj1, public virtual obj2
{
public:
virtual RR_SHARED_PTR<RobotRaconteur::RRArray<double > > get_d1()=0;
virtual void set_d1(RR_SHARED_PTR<RobotRaconteur::RRArray<double > > value)=0;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.obj3";  }
};

class obj4 : public virtual com::robotraconteur::testing::TestService1::sub2
{
public:
virtual std::string get_s_ind()=0;
virtual void set_s_ind(const std::string& value)=0;

virtual int32_t get_i_ind()=0;
virtual void set_i_ind(int32_t value)=0;

virtual std::string get_data()=0;
virtual void set_data(const std::string& value)=0;

virtual RR_SHARED_PTR<com::robotraconteur::testing::TestService1::sub3 > get_o3_1(const std::string& ind)=0;

virtual std::string RRType() {return "com.robotraconteur.testing.TestService3.obj4";  }
};

}
}
}
}

namespace RobotRaconteur
{
RRPrimUtilCStructure(com::robotraconteur::testing::TestService3::testcstruct1, "com.robotraconteur.testing.TestService3.testcstruct1");
RRPrimUtilCStructure(com::robotraconteur::testing::TestService3::testcstruct2, "com.robotraconteur.testing.TestService3.testcstruct2");
}
