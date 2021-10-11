package day15;

public class Override3 {
	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.method3();
	}
	void method1() {}
	void method2() {System.out.println("부모메소드");}
}

class A3 extends Override3{
	void method2() {System.out.println("자식메소드");}
	
	void method3() {
		method2();
		//부모클래스의 메소드 호출 : super.부모메소드();
		super.method2();
	}
}