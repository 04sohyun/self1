package day14;

public class Extends7 {
	public static void main(String[] args) {
		A4 a = new A4(3);
	}
	//기본생성자
	public Extends7() {
		System.out.println("기본생성자Extends7");
	}
	//매개변수가 있는 생성자
	public Extends7(int x) {
		System.out.println("부모클래스의 매개변수생성자"+x);
	}
}

class A4 extends Extends7 {
	public A4() {
		System.out.println("생성자A4");
	}
	public A4(int x) {
		super(x);
		System.out.println("자식클래스의 매개변수생성자"+x);
	}
}