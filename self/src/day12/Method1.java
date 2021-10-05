package day12;

public class Method1 {
//1.매개변수O, 리턴타입O
	int sum(int x, int y) {
		return x+y;
	}
//2.매개변수X, 리턴타입O
	String greeting() {
		return "hello";
	}
//3.매개변수O, 리턴타입X
	void sumVoid(int x, int y) {
		System.out.println("result="+(x+y));
	}
//4.매개변수X, 리턴타입X
	void greetingVoid() {
		System.out.println("hi");
	}
}
