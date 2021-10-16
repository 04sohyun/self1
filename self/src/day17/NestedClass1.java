package day17;

public class NestedClass1 {
 //인스턴스 멤버 클래스
	class B{
	 int field1;
	 //static int field2;//인스턴스 멤버 클래스는 정적필드,메소드 생성x
	 
	 B(){}
	 
	 void method1() {}
	 //static void method2() {}
 }
}