package day13;

public class SingleTon2 {
  //1.자신타입의 static 필드 선언
	private static SingleTon2 instance;
  //2.생성자를 외부에서 접근 못하도록 private로 처리
	private SingleTon2() {}
  //3.public메소드로 접근하도록 메소드 선언
	public static SingleTon2 getInstance() {//사용할 때 객체를 생성하므로 공간활용에 좋다.
		if(instance==null) instance = new SingleTon2();
		return instance;
	}
	
}
