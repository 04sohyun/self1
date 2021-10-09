package day14;

public class Extends4 {
	public static void main(String[] args) {
		A1 a = new A1();
	}
	//기본생성자
	public Extends4() {
		System.out.println("기본생성자Extends4");
	}
	//매개변수가 있는 생성자
	public Extends4(int x) {
		System.out.println("매개변수생성자"+x);
	}
}

class A1 extends Extends4 {
	public A1() {
		System.out.println("생성자A1");
	}
}