package day15;

public abstract class Abstract1 {
	abstract void run(); //실행부X
	void method() {}  //실행부O
	
	public static void main(String[] args) {
		//객체를 생성할 수 없는 클래스 - abstract클래스
		//Abstract1 a = new Abstract1();
		Fish f = new Fish();
		Bird b = new Bird();
		Insect i = new Insect();
		f.run();
		i.run();
		b.run();
	}
}
class Fish extends Abstract1{
	void run() {//재정의 필수
		System.out.println("헤엄칩니다.");
	}
}
class Bird extends Abstract1{
	void run() {
		System.out.println("날아갑니다.");
	}
}
class Insect extends Abstract1{
	void run() {
		System.out.println("기어갑니다.");
	}
}