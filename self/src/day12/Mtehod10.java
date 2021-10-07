package day12;

public class Mtehod10 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.call(20, 10);
		int result = c1.cal2(4, 3);
		System.out.println(result);
	}
}
class C1{
	void call(int x, int y) {
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		System.out.printf("%d * %d = %d\n",x,y,x*y);
		System.out.printf("%d / %d = %d\n",x,y,x/y);
	}
	int cal2(int x, int y) {
		return x*y;
	}
}