package day14;

public class Extends6 {
	public static void main(String[] args) {
		A3 a = new A3(3);
	}
	//기본생성자
	public Extends6() {
		System.out.println("기본생성자Extends6");
	}
	//매개변수가 있는 생성자
	public Extends6(int x) {
		System.out.println("부모클래스의 매개변수생성자"+x);
	}
}

class A3 extends Extends6 {
	public A3() {
		System.out.println("생성자A3");
	}
	public A3(int x) {
		System.out.println("자식클래스의 매개변수생성자"+x);
	}
}