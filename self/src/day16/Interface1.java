package day16;

public interface Interface1 {
	//상수 - 선언과 동시에 초기화
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10;
	
	//메소드 - 추상메소드는 선언부만 있음
	void method();
}
//실체클래스 구현
class TVRemoteControl implements Interface1{

	//재정의 필수
	@Override
	public void method() {
		System.out.println("실체 클래스메소드");
	}
	
}