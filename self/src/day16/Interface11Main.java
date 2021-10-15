package day16;

public class Interface11Main {
	public static void main(String[] args) {
		//추상클래스는 객체생성X
		//A11 a11 = new A11();
		//Interface11 i11 = new A11();
		
		Interface11 i11 = new B11();
		i11.method();
	}
}
