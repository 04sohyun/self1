package day16;

public class Interface1Main {
	public static void main(String[] args) {
		//구현클래스의 객체를 인터페이스에 대입
		Interface1 i1 = new TVRemoteControl();
		//실행은 실체클래스의 재정의된 메소드 내용이 실행
		i1.method();
	}

}
