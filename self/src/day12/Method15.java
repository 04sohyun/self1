package day12;

public class Method15 {
	public static void main(String[] args) {
		A3 a = new A3();
		System.out.println("ÇÕ°è:"+a.add(10, 20));
		System.out.println("Á¦°ö:"+a.square(3.5));
		a.multiply(3, 5);
	}
}
class A3{
	int add(int x, int y) {
		return x+y;
	}
	double square(double d) {
		return d*d;
	}
	void multiply(int a1, int a2) {
		System.out.printf("%d * %d = %d",a1,a2,a1*a2);
	}
}