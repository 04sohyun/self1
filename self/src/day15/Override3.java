package day15;

public class Override3 {
	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.method3();
	}
	void method1() {}
	void method2() {System.out.println("�θ�޼ҵ�");}
}

class A3 extends Override3{
	void method2() {System.out.println("�ڽĸ޼ҵ�");}
	
	void method3() {
		method2();
		//�θ�Ŭ������ �޼ҵ� ȣ�� : super.�θ�޼ҵ�();
		super.method2();
	}
}