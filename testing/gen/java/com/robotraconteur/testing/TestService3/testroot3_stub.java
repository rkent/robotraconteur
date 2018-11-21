//This file is automatically generated. DO NOT EDIT!
package com.robotraconteur.testing.TestService3;
import java.util.*;
import com.robotraconteur.*;
public class testroot3_stub extends ServiceStub implements testroot3, async_testroot3 {
    private Pipe<int[]> rr_unreliable1;
    private Pipe<int[]> rr_unreliable2;
    private Pipe<int[]> rr_p1;
    private Pipe<int[]> rr_p2;
    private Pipe<MultiDimArray> rr_p3;
    private Wire<int[]> rr_peekwire;
    private Wire<int[]> rr_pokewire;
    private Wire<int[]> rr_w1;
    private Wire<int[]> rr_w2;
    private Wire<MultiDimArray> rr_w3;
    private ArrayMemory<double[]> rr_readmem;
    private CStructureArrayMemory<testcstruct2[]> rr_cstruct_m1;
    private CStructureMultiDimArrayMemory<testcstruct2[]> rr_cstruct_m2;
    public testroot3_stub(WrappedServiceStub innerstub) {
        super(innerstub); 
    rr_unreliable1=new Pipe<int[]>(innerstub.getPipe("unreliable1"));
    rr_unreliable2=new Pipe<int[]>(innerstub.getPipe("unreliable2"));
    rr_p1=new Pipe<int[]>(innerstub.getPipe("p1"));
    rr_p2=new Pipe<int[]>(innerstub.getPipe("p2"));
    rr_p3=new Pipe<MultiDimArray>(innerstub.getPipe("p3"));
    rr_peekwire=new Wire<int[]>(innerstub.getWire("peekwire"));
    rr_pokewire=new Wire<int[]>(innerstub.getWire("pokewire"));
    rr_w1=new Wire<int[]>(innerstub.getWire("w1"));
    rr_w2=new Wire<int[]>(innerstub.getWire("w2"));
    rr_w3=new Wire<MultiDimArray>(innerstub.getWire("w3"));
    rr_readmem=new ArrayMemoryClient<double[]>(innerstub.getArrayMemory("readmem"));
    rr_cstruct_m1=new CStructureArrayMemoryClient<testcstruct2[]>(innerstub.getCStructureArrayMemory("cstruct_m1"));
    rr_cstruct_m2=new CStructureMultiDimArrayMemoryClient<testcstruct2[]>(innerstub.getCStructureMultiDimArrayMemory("cstruct_m2"));
    }
    public int get_readme() {
    return (MessageElementUtil.<int[]>castDataAndDispose(rr_innerstub.propertyGet("readme")))[0];
    }
    public void set_readme(int value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value",new int[] {value});
    rr_innerstub.propertySet("readme", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public int get_writeme() {
    return (MessageElementUtil.<int[]>castDataAndDispose(rr_innerstub.propertyGet("writeme")))[0];
    }
    public void set_writeme(int value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value",new int[] {value});
    rr_innerstub.propertySet("writeme", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public int get_unknown_modifier() {
    return (MessageElementUtil.<int[]>castDataAndDispose(rr_innerstub.propertyGet("unknown_modifier")))[0];
    }
    public void set_unknown_modifier(int value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value",new int[] {value});
    rr_innerstub.propertySet("unknown_modifier", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public testenum1 get_testenum1_prop() {
    return testenum1.intToEnum((MessageElementUtil.<int[]>castDataAndDispose(rr_innerstub.propertyGet("testenum1_prop"))[0]));
    }
    public void set_testenum1_prop(testenum1 value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value", new int[] {((int)value.getValue())});
    rr_innerstub.propertySet("testenum1_prop", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public testcstruct1 get_testcstruct1_prop() {
    return MessageElementUtil.<testcstruct1>unpackCStructureFromArray(rr_innerstub.propertyGet("testcstruct1_prop"));
    }
    public void set_testcstruct1_prop(testcstruct1 value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<testcstruct1>packCStructureToArray("value",value);
    rr_innerstub.propertySet("testcstruct1_prop", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public teststruct3 get_teststruct3_prop() {
    return MessageElementUtil.<teststruct3>unpackStructure(rr_innerstub.propertyGet("teststruct3_prop"));
    }
    public void set_teststruct3_prop(teststruct3 value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.packStructure("value",value);
    rr_innerstub.propertySet("teststruct3_prop", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public List<double[]> get_d1() {
    return DataTypeUtil.verifyArrayLength1(MessageElementUtil.<double[]>unpackListType(rr_innerstub.propertyGet("d1")), 6, false);
    }
    public void set_d1(List<double[]> value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<double[]>packListType("value",DataTypeUtil.verifyArrayLength1(value, 6, false),double[].class);
    rr_innerstub.propertySet("d1", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public List<double[]> get_d2() {
    return DataTypeUtil.verifyArrayLength1(MessageElementUtil.<double[]>unpackListType(rr_innerstub.propertyGet("d2")), 6, true);
    }
    public void set_d2(List<double[]> value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<double[]>packListType("value",DataTypeUtil.verifyArrayLength1(value, 6, true),double[].class);
    rr_innerstub.propertySet("d2", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public Map<Integer,double[]> get_d3() {
    return DataTypeUtil.verifyArrayLength1(MessageElementUtil.<Integer,double[]>unpackMapType(rr_innerstub.propertyGet("d3")), 6, false);
    }
    public void set_d3(Map<Integer,double[]> value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<Integer,double[]>packMapType("value",DataTypeUtil.verifyArrayLength1(value, 6, false),Integer.class,double[].class);
    rr_innerstub.propertySet("d3", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public Map<Integer,double[]> get_d4() {
    return DataTypeUtil.verifyArrayLength1(MessageElementUtil.<Integer,double[]>unpackMapType(rr_innerstub.propertyGet("d4")), 6, true);
    }
    public void set_d4(Map<Integer,double[]> value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<Integer,double[]>packMapType("value",DataTypeUtil.verifyArrayLength1(value, 6, true),Integer.class,double[].class);
    rr_innerstub.propertySet("d4", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public List<MultiDimArray> get_d5() {
    return DataTypeUtil.verifyArrayLength2(MessageElementUtil.<MultiDimArray>unpackListType(rr_innerstub.propertyGet("d5")),9,new int[] {3,3});
    }
    public void set_d5(List<MultiDimArray> value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<MultiDimArray>packListType("value",DataTypeUtil.verifyArrayLength2(value,9,new int[] {3,3}),MultiDimArray.class);
    rr_innerstub.propertySet("d5", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public Map<Integer,MultiDimArray> get_d6() {
    return DataTypeUtil.verifyArrayLength2(MessageElementUtil.<Integer,MultiDimArray>unpackMapType(rr_innerstub.propertyGet("d6")),9,new int[] {3,3});
    }
    public void set_d6(Map<Integer,MultiDimArray> value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<Integer,MultiDimArray>packMapType("value",DataTypeUtil.verifyArrayLength2(value,9,new int[] {3,3}),Integer.class,MultiDimArray.class);
    rr_innerstub.propertySet("d6", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public void testcstruct1_func1(testcstruct1 s) {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    MessageElement rr_me=null;
    try {
    MessageElementUtil.addMessageElementDispose(rr_param, MessageElementUtil.<testcstruct1>packCStructureToArray("s",s));
    rr_me=rr_innerstub.functionCall("testcstruct1_func1",rr_param);
    }
    finally {
    rr_param.delete();
    if (rr_me!=null) rr_me.delete();
    }
    }
    public testcstruct1 testcstruct1_func2() {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    MessageElement rr_me=null;
    try {
    rr_me=rr_innerstub.functionCall("testcstruct1_func2",rr_param);
    return MessageElementUtil.<testcstruct1>unpackCStructureFromArray(rr_me);
    }
    finally {
    rr_param.delete();
    if (rr_me!=null) rr_me.delete();
    }
    }
    public Generator2<double[]> gen_func1() {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    WrappedGeneratorClient generator_client = rr_innerstub.generatorFunctionCall("gen_func1",rr_param);
    return new Generator2Client<double[]>(generator_client);
    }
    finally {
    rr_param.delete();
    }
    }
    public Generator2<UnsignedBytes> gen_func2(String name) {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.packString("name",name));
    WrappedGeneratorClient generator_client = rr_innerstub.generatorFunctionCall("gen_func2",rr_param);
    return new Generator2Client<UnsignedBytes>(generator_client);
    }
    finally {
    rr_param.delete();
    }
    }
    public Generator3<UnsignedBytes> gen_func3(String name) {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.packString("name",name));
    WrappedGeneratorClient generator_client = rr_innerstub.generatorFunctionCall("gen_func3",rr_param);
    return new Generator3Client<UnsignedBytes>(generator_client);
    }
    finally {
    rr_param.delete();
    }
    }
    public Generator1<UnsignedBytes,UnsignedBytes> gen_func4() {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    WrappedGeneratorClient generator_client = rr_innerstub.generatorFunctionCall("gen_func4",rr_param);
    return new Generator1Client<UnsignedBytes,UnsignedBytes>(generator_client);
    }
    finally {
    rr_param.delete();
    }
    }
    public Generator1<com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2> gen_func5() {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    WrappedGeneratorClient generator_client = rr_innerstub.generatorFunctionCall("gen_func5",rr_param);
    return new Generator1Client<com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2>(generator_client);
    }
    finally {
    rr_param.delete();
    }
    }
    public void dispatchEvent(String rr_membername, vectorptr_messageelement rr_m) {
    }
    public obj4 get_o4() {
    return (obj4)findObjRefTyped("o4","com.robotraconteur.testing.TestService3.obj4");
    }
    public Pipe<int[]> get_unreliable1()
    { return rr_unreliable1;  }
    public void set_unreliable1(Pipe<int[]> value)
    { throw new RuntimeException();}
    public Pipe<int[]> get_unreliable2()
    { return rr_unreliable2;  }
    public void set_unreliable2(Pipe<int[]> value)
    { throw new RuntimeException();}
    public Pipe<int[]> get_p1()
    { return rr_p1;  }
    public void set_p1(Pipe<int[]> value)
    { throw new RuntimeException();}
    public Pipe<int[]> get_p2()
    { return rr_p2;  }
    public void set_p2(Pipe<int[]> value)
    { throw new RuntimeException();}
    public Pipe<MultiDimArray> get_p3()
    { return rr_p3;  }
    public void set_p3(Pipe<MultiDimArray> value)
    { throw new RuntimeException();}
    public Wire<int[]> get_peekwire()
    { return rr_peekwire;  }
    public void set_peekwire(Wire<int[]> value)
    { throw new RuntimeException();}
    public Wire<int[]> get_pokewire()
    { return rr_pokewire;  }
    public void set_pokewire(Wire<int[]> value)
    { throw new RuntimeException();}
    public Wire<int[]> get_w1()
    { return rr_w1;  }
    public void set_w1(Wire<int[]> value)
    { throw new RuntimeException();}
    public Wire<int[]> get_w2()
    { return rr_w2;  }
    public void set_w2(Wire<int[]> value)
    { throw new RuntimeException();}
    public Wire<MultiDimArray> get_w3()
    { return rr_w3;  }
    public void set_w3(Wire<MultiDimArray> value)
    { throw new RuntimeException();}
    public MessageElement callbackCall(String rr_membername, vectorptr_messageelement rr_m) {
    throw new MemberNotFoundException("Member not found");
    }
    public ArrayMemory<double[]> get_readmem()
    { return rr_readmem; }
    public CStructureArrayMemory<testcstruct2[]> get_cstruct_m1()
    { return rr_cstruct_m1; }
    public CStructureMultiDimArrayMemory<testcstruct2[]> get_cstruct_m2()
    { return rr_cstruct_m2; }
    public void async_get_readme(Action2<Integer,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("readme",new rrend_async_get_readme(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_readme implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Integer,RuntimeException> rr_handler=(Action2<Integer,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action((int)0,err);
    return;
    }
    Integer rr_ret;
    try {
    rr_ret=(MessageElementUtil.<int[]>castDataAndDispose(value))[0];
    } catch (RuntimeException err2) {
    rr_handler.action((int)0,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_readme(int value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value",new int[] {value});
    rr_async_PropertySet("readme",m,new rrend_async_set_readme(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_readme implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_writeme(Action2<Integer,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("writeme",new rrend_async_get_writeme(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_writeme implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Integer,RuntimeException> rr_handler=(Action2<Integer,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action((int)0,err);
    return;
    }
    Integer rr_ret;
    try {
    rr_ret=(MessageElementUtil.<int[]>castDataAndDispose(value))[0];
    } catch (RuntimeException err2) {
    rr_handler.action((int)0,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_writeme(int value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value",new int[] {value});
    rr_async_PropertySet("writeme",m,new rrend_async_set_writeme(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_writeme implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_unknown_modifier(Action2<Integer,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("unknown_modifier",new rrend_async_get_unknown_modifier(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_unknown_modifier implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Integer,RuntimeException> rr_handler=(Action2<Integer,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action((int)0,err);
    return;
    }
    Integer rr_ret;
    try {
    rr_ret=(MessageElementUtil.<int[]>castDataAndDispose(value))[0];
    } catch (RuntimeException err2) {
    rr_handler.action((int)0,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_unknown_modifier(int value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value",new int[] {value});
    rr_async_PropertySet("unknown_modifier",m,new rrend_async_set_unknown_modifier(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_unknown_modifier implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_testenum1_prop(Action2<testenum1,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("testenum1_prop",new rrend_async_get_testenum1_prop(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_testenum1_prop implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<testenum1,RuntimeException> rr_handler=(Action2<testenum1,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    testenum1 rr_ret;
    try {
    rr_ret=testenum1.intToEnum((MessageElementUtil.<int[]>castDataAndDispose(value)[0]));
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_testenum1_prop(testenum1 value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<int[]>packArray("value", new int[] {((int)value.getValue())});
    rr_async_PropertySet("testenum1_prop",m,new rrend_async_set_testenum1_prop(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_testenum1_prop implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_testcstruct1_prop(Action2<testcstruct1,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("testcstruct1_prop",new rrend_async_get_testcstruct1_prop(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_testcstruct1_prop implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<testcstruct1,RuntimeException> rr_handler=(Action2<testcstruct1,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    testcstruct1 rr_ret;
    try {
    rr_ret=MessageElementUtil.<testcstruct1>unpackCStructureFromArray(value);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_testcstruct1_prop(testcstruct1 value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<testcstruct1>packCStructureToArray("value",value);
    rr_async_PropertySet("testcstruct1_prop",m,new rrend_async_set_testcstruct1_prop(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_testcstruct1_prop implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_teststruct3_prop(Action2<teststruct3,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("teststruct3_prop",new rrend_async_get_teststruct3_prop(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_teststruct3_prop implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<teststruct3,RuntimeException> rr_handler=(Action2<teststruct3,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    teststruct3 rr_ret;
    try {
    rr_ret=MessageElementUtil.<teststruct3>unpackStructure(value);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_teststruct3_prop(teststruct3 value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.packStructure("value",value);
    rr_async_PropertySet("teststruct3_prop",m,new rrend_async_set_teststruct3_prop(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_teststruct3_prop implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_d1(Action2<List<double[]>,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("d1",new rrend_async_get_d1(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_d1 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<List<double[]>,RuntimeException> rr_handler=(Action2<List<double[]>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    List<double[]> rr_ret;
    try {
    rr_ret=DataTypeUtil.verifyArrayLength1(MessageElementUtil.<double[]>unpackListType(value), 6, false);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_d1(List<double[]> value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<double[]>packListType("value",DataTypeUtil.verifyArrayLength1(value, 6, false),double[].class);
    rr_async_PropertySet("d1",m,new rrend_async_set_d1(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_d1 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_d2(Action2<List<double[]>,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("d2",new rrend_async_get_d2(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_d2 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<List<double[]>,RuntimeException> rr_handler=(Action2<List<double[]>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    List<double[]> rr_ret;
    try {
    rr_ret=DataTypeUtil.verifyArrayLength1(MessageElementUtil.<double[]>unpackListType(value), 6, true);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_d2(List<double[]> value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<double[]>packListType("value",DataTypeUtil.verifyArrayLength1(value, 6, true),double[].class);
    rr_async_PropertySet("d2",m,new rrend_async_set_d2(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_d2 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_d3(Action2<Map<Integer,double[]>,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("d3",new rrend_async_get_d3(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_d3 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Map<Integer,double[]>,RuntimeException> rr_handler=(Action2<Map<Integer,double[]>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Map<Integer,double[]> rr_ret;
    try {
    rr_ret=DataTypeUtil.verifyArrayLength1(MessageElementUtil.<Integer,double[]>unpackMapType(value), 6, false);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_d3(Map<Integer,double[]> value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<Integer,double[]>packMapType("value",DataTypeUtil.verifyArrayLength1(value, 6, false),Integer.class,double[].class);
    rr_async_PropertySet("d3",m,new rrend_async_set_d3(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_d3 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_d4(Action2<Map<Integer,double[]>,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("d4",new rrend_async_get_d4(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_d4 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Map<Integer,double[]>,RuntimeException> rr_handler=(Action2<Map<Integer,double[]>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Map<Integer,double[]> rr_ret;
    try {
    rr_ret=DataTypeUtil.verifyArrayLength1(MessageElementUtil.<Integer,double[]>unpackMapType(value), 6, true);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_d4(Map<Integer,double[]> value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<Integer,double[]>packMapType("value",DataTypeUtil.verifyArrayLength1(value, 6, true),Integer.class,double[].class);
    rr_async_PropertySet("d4",m,new rrend_async_set_d4(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_d4 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_d5(Action2<List<MultiDimArray>,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("d5",new rrend_async_get_d5(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_d5 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<List<MultiDimArray>,RuntimeException> rr_handler=(Action2<List<MultiDimArray>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    List<MultiDimArray> rr_ret;
    try {
    rr_ret=DataTypeUtil.verifyArrayLength2(MessageElementUtil.<MultiDimArray>unpackListType(value),9,new int[] {3,3});
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_d5(List<MultiDimArray> value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<MultiDimArray>packListType("value",DataTypeUtil.verifyArrayLength2(value,9,new int[] {3,3}),MultiDimArray.class);
    rr_async_PropertySet("d5",m,new rrend_async_set_d5(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_d5 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_d6(Action2<Map<Integer,MultiDimArray>,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("d6",new rrend_async_get_d6(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_d6 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Map<Integer,MultiDimArray>,RuntimeException> rr_handler=(Action2<Map<Integer,MultiDimArray>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Map<Integer,MultiDimArray> rr_ret;
    try {
    rr_ret=DataTypeUtil.verifyArrayLength2(MessageElementUtil.<Integer,MultiDimArray>unpackMapType(value),9,new int[] {3,3});
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_d6(Map<Integer,MultiDimArray> value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<Integer,MultiDimArray>packMapType("value",DataTypeUtil.verifyArrayLength2(value,9,new int[] {3,3}),Integer.class,MultiDimArray.class);
    rr_async_PropertySet("d6",m,new rrend_async_set_d6(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_d6 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_testcstruct1_func1(testcstruct1 s,Action1<RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.<testcstruct1>packCStructureToArray("s",s));
    rr_async_FunctionCall("testcstruct1_func1",rr_param,new rrend_async_testcstruct1_func1(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_testcstruct1_func1 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement ret ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_testcstruct1_func2(Action2<testcstruct1,RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    rr_async_FunctionCall("testcstruct1_func2",rr_param,new rrend_async_testcstruct1_func2(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_testcstruct1_func2 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement ret ,RuntimeException err,Object param)
    {
    Action2<testcstruct1,RuntimeException> rr_handler=(Action2<testcstruct1,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    testcstruct1 rr_ret;
    try {
    rr_ret=MessageElementUtil.<testcstruct1>unpackCStructureFromArray(ret);
    } catch (RuntimeException err2) {
    rr_handler.action(null,err2);
    return;
    }
    rr_handler.action(rr_ret, null);
    }
    }
    public void async_gen_func1(Action2<Generator2<double[]>, RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    rr_async_GeneratorFunctionCall("gen_func1",rr_param,new rrend_async_gen_func1(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_gen_func1 implements Action3<WrappedGeneratorClient, RuntimeException, Object> {
    public void action(WrappedGeneratorClient ret, RuntimeException err, Object param)
    {
    Action2<Generator2<double[]>,RuntimeException> rr_handler=(Action2<Generator2<double[]>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Generator2Client< double[]> rr_ret=new Generator2Client< double[]>(ret);
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_gen_func2(String name,Action2<Generator2<UnsignedBytes>, RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.packString("name",name));
    rr_async_GeneratorFunctionCall("gen_func2",rr_param,new rrend_async_gen_func2(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_gen_func2 implements Action3<WrappedGeneratorClient, RuntimeException, Object> {
    public void action(WrappedGeneratorClient ret, RuntimeException err, Object param)
    {
    Action2<Generator2<UnsignedBytes>,RuntimeException> rr_handler=(Action2<Generator2<UnsignedBytes>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Generator2Client< UnsignedBytes> rr_ret=new Generator2Client< UnsignedBytes>(ret);
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_gen_func3(String name,Action2<Generator3<UnsignedBytes>, RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.packString("name",name));
    rr_async_GeneratorFunctionCall("gen_func3",rr_param,new rrend_async_gen_func3(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_gen_func3 implements Action3<WrappedGeneratorClient, RuntimeException, Object> {
    public void action(WrappedGeneratorClient ret, RuntimeException err, Object param)
    {
    Action2<Generator3<UnsignedBytes>,RuntimeException> rr_handler=(Action2<Generator3<UnsignedBytes>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Generator3Client< UnsignedBytes> rr_ret=new Generator3Client< UnsignedBytes>(ret);
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_gen_func4(Action2<Generator1<UnsignedBytes,UnsignedBytes>, RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    rr_async_GeneratorFunctionCall("gen_func4",rr_param,new rrend_async_gen_func4(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_gen_func4 implements Action3<WrappedGeneratorClient, RuntimeException, Object> {
    public void action(WrappedGeneratorClient ret, RuntimeException err, Object param)
    {
    Action2<Generator1<UnsignedBytes,UnsignedBytes>,RuntimeException> rr_handler=(Action2<Generator1<UnsignedBytes,UnsignedBytes>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Generator1Client< UnsignedBytes,UnsignedBytes> rr_ret=new Generator1Client< UnsignedBytes,UnsignedBytes>(ret);
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_gen_func5(Action2<Generator1<com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2>, RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    rr_async_GeneratorFunctionCall("gen_func5",rr_param,new rrend_async_gen_func5(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_gen_func5 implements Action3<WrappedGeneratorClient, RuntimeException, Object> {
    public void action(WrappedGeneratorClient ret, RuntimeException err, Object param)
    {
    Action2<Generator1<com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2>,RuntimeException> rr_handler=(Action2<Generator1<com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2>,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(null,err);
    return;
    }
    Generator1Client< com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2> rr_ret=new Generator1Client< com.robotraconteur.testing.TestService1.teststruct2,com.robotraconteur.testing.TestService1.teststruct2>(ret);
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_get_o4(Action2<obj4,RuntimeException> handler, int timeout) {
    asyncFindObjRefTyped("o4","com.robotraconteur.testing.TestService3.obj4",handler,timeout);
    }
}
