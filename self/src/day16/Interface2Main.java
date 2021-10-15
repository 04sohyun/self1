package day16;

public class Interface2Main {
	public static void main(String[] args) {
		//인터페이스로 생성자를 호출해서 객체생성 불가
		//Interface2 i2 = new Interface2();
		G2 g2 = new G2();
		G3 g3 = new G3();
		
		//인터페이스타입으로 선언하고 실체클래스로 객체의 생성 
		Interface2 i2 = g2;
		i2.a();
		//다형성
		i2 = g3;
		i2.a();
	
	}
}
