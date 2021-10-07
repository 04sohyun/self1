package day12;

public class ValuePassing {
	public static void main(String[] args) {
		int n = 10;
		
		increase(n);
		System.out.println(n);//10
	}

static void increase(int m) {
	m=m+1;//11
}
}