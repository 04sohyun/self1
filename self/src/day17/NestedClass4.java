package day17;

public class NestedClass4 {
	//인스턴스멤버클래스
	class B{
		int field1;
		B(){}
		void method1() {}
	}
	//정적멤버클래스
	static class C{
		int field1;
		static int field2;
		C(){}
		void method1() {}
		static void method2() {}
	}
	void method() {
		//로컬클래스
		class D{
			D(){System.out.println("로컬클래스 생성자");}
			int field1;
			//static int field2;
			void method1() {System.out.println("로컬클래스D의 메소드");}
			//static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
