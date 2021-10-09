package day14;

public class Extends8 {
	public static void main(String[] args) {
		A5 a = new A5();
	}
	//기본생성자
	public Extends8() {
		System.out.println("기본생성자Extends8");
	}
	//매개변수가 있는 생성자
	public Extends8(int x) {
		System.out.println("부모클래스의 매개변수생성자"+x);
	}
}

class A5 extends Extends8 {
	public A5() {
		super(5);
		System.out.println("생성자A5");
	}
	
}