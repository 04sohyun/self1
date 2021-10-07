package day12;

public class Method12 {
	public static void main(String[] args) {
		E1 e1 = new E1();
		e1.greet(7);
	}
}
class E1{
	void greet(int x) {
		System.out.println("¾È³ç:"+x);
		if(x<1)return;
		greet(--x);
	}
}