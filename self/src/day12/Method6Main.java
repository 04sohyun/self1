package day12;

public class Method6Main {
	public static void main(String[] args) {
		Method6 m = new Method6();
		
		int res1 = m.add(10, 15);
		System.out.println(res1);
		
		
		m.i=10; m.j=4;
		int res2 = m.divid();
		System.out.println(res2);
		
		m.sub(15, 2);
		
		m.mul();
	}

}
