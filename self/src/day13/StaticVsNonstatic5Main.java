package day13;

public class StaticVsNonstatic5Main {
	public static void main(String[] args) {
		//static멤버 호출 - 클래스명.필드
		System.out.println(StaticVsNonstatic5.pi);
		
		//클래스명.메소드();
		int result1=StaticVsNonstatic5.plus(10, 20);
		int result2=StaticVsNonstatic5.minus(10, 20);
		System.out.println(result1);
		System.out.println(result2);
	
		//객체생성X
		//StaticVsNonstatic5 s = new StaticVsNonstatic5();
		//s.pi;
		//s.plus(10, 20);
		//s.minus(10, 20);
	}
}
