package day12;

public class Method1Main {
	public static void main(String[] args) {
		Method1 m = new Method1();
		
		//1
		int result = m.sum(10, 20);
		System.out.println(result);
		
		//2
		String str1 = m.greeting();
		System.out.println(str1);
		
		//3
		m.sumVoid(15, 14);
		
		//4
		m.greetingVoid();
	}

}
