package day17;

public class NestedClass5 {
	//�ʵ�
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	//�ν��Ͻ� ���Ŭ����
	class B{
		String field1 = "Inner-field";
		void method1() {
			System.out.println("Inner-method");
		}
		void print() {
			System.out.println(this.field1);//Inner-field
			this.method1();//Inner-method
			System.out.println(NestedClass5.this.field);//Outter-field
			NestedClass5.this.method();//Outter-method
		}
	}
}
