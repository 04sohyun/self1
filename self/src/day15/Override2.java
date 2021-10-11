package day15;

public class Override2 {
	public static void main(String[] args) {
		A a = new A();
		a.method1();
	}
	public void method1() {
		System.out.println("부모메소드");
	}
}

class A extends Override2{
	//부모메소드를 숨기는 효과
	@Override
	public void method1() {
		System.out.println("자식메소드");
	}
	
}