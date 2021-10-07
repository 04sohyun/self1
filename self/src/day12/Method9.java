package day12;

public class Method9 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		int result = b1.add(15, 23);
		System.out.println(result);
		float result2 = b1.add2(11, 15);
		System.out.println(result2);
	}
}
class B1{
	//리턴타입있는 메소드
	int add(int x, int y) {
		return x+y;
	}
	float add2(int x, int y) {
		return x+y;
	}
}