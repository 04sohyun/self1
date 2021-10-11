package day15;

public class Override1 {
	public static void main(String[] args) {
		A1 a1 = new A1(); a1.a();
		A2 a2 = new A2(); a2.a(); a2.a(7);

		//자식객체를 생성하여 부모타입으로 형변환 후 메소드 실행
		//자식클래스에서 재정의된 메소드는 부모클래스로 형변환하더라도 실행시 재정의된 내용으로 실행
		//자식클래스에서 추가된 메소드는 부모클래스로 형변환시 실행불가(원래 부모메소드에 없었기때문)
		A1 a3 = new A2(); a3.a(); //a3.a(7);
	}
}

class A1{
	void a() {
		System.out.println("부모 메소드");
	}
}
//오버라이딩 시 메소드명, 매개변수, 반환형이 일치해야한다.
//접근지정자는 자식이 부모보다 더 넓어야 한다.
class A2 extends A1{
	public void a() {
		System.out.println("자식 메소드");
	}
	public void a(int k) {//추가된 메소드
		System.out.println("k method");
	}
}