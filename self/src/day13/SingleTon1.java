package day13;

public class SingleTon1 {
  //1.자신타입의 static 필드 선언
	private static SingleTon1 instance = new SingleTon1();//로더가 될 때 바로 만들어지므로 공간활용은 낮지만 속도는 빠름
  //2.생성자를 외부에서 접근 못하도록 private로 처리
	private SingleTon1() {}
  //3.public메소드로 접근하도록 메소드 선언
	public static SingleTon1 getInstance() {
		return instance;
	}
	
}
