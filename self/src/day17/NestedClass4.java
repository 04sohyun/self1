package day17;

public class NestedClass4 {
	//�ν��Ͻ����Ŭ����
	class B{
		int field1;
		B(){}
		void method1() {}
	}
	//�������Ŭ����
	static class C{
		int field1;
		static int field2;
		C(){}
		void method1() {}
		static void method2() {}
	}
	void method() {
		//����Ŭ����
		class D{
			D(){System.out.println("����Ŭ���� ������");}
			int field1;
			//static int field2;
			void method1() {System.out.println("����Ŭ����D�� �޼ҵ�");}
			//static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}