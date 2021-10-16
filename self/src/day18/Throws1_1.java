package day18;

public class Throws1_1 {
	Throws1 a = new Throws1();
	void method() {
		try {
			a.method();
		} catch (Exception e) {
			System.out.println("A메소드에서 발생한 오류");
		}
	}
}
