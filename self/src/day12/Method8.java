package day12;

public class Method8 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add(10, 31);
		a1.print("안녕");
	}
}
class A1{
	//메소드1
	void add(int x, int y) {
		System.out.println("합계:"+(x+y));
	}
	//메소드2
	void print(String msg) {
		System.out.println("전달사항:"+msg);
	}
}