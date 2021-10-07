package day12;

public class Method11 {
	public static void main(String[] args) {
		D1 d1 = new D1();
		d1.divide(10, 20);
		d1.divide(10.0f, 20.0f);
	}
}
class D1{
	void divide(int x, int y) {
		if(y==0) {
			System.out.println("¿À·ù");
		}else {
			System.out.printf("%d / %d = %d\n",x,y,x/y);
		}
	}
	void divide(float x, float y) {
		System.out.printf("%3.1f / %3.1f = %3.2f\n",x,y,x/y);
	}
}