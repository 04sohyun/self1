package day12;

public class Method1 {
//1.�Ű�����O, ����Ÿ��O
	int sum(int x, int y) {
		return x+y;
	}
//2.�Ű�����X, ����Ÿ��O
	String greeting() {
		return "hello";
	}
//3.�Ű�����O, ����Ÿ��X
	void sumVoid(int x, int y) {
		System.out.println("result="+(x+y));
	}
//4.�Ű�����X, ����Ÿ��X
	void greetingVoid() {
		System.out.println("hi");
	}
}
