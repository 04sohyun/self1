package day13;

public class Initial3 {
	public static void main(String[] args) {
		Block b1 = new Block();//static초기화 -> 인스턴스초기화 -> 생성자
		Block b2 = new Block();//인스턴스초기화 -> 생성자
		Block b3 = new Block();//인스턴스초기화 -> 생성자
	}
}
class Block{
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	//static초기화블럭은 최초 클래스 로드시 한번만 실행
	static {
		System.out.println("static 초기화 블럭");
	}
	
	Block(){System.out.println("생성자");}
}