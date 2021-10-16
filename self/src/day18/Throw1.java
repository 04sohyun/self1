package day18;

public class Throw1 {
	void method() {
		try {
			System.out.println("A의 메소드");
			//예외객체를 강제 생성
			throw new Exception();
		}catch(Exception e) {
			System.out.println("A의 예외발생");
		}
	}
}
