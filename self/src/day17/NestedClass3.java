package day17;

public class NestedClass3 {
	//정적 멤버 클래스
	static class B{
		int field1;
		static int field2;//정적멤버클래스는 모든 필드와 메소드 생성가능
		
		B(){}
		
		void method1() {}
		static void method2() {}
	}
}
