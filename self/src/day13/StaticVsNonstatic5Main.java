package day13;

public class StaticVsNonstatic5Main {
	public static void main(String[] args) {
		//static��� ȣ�� - Ŭ������.�ʵ�
		System.out.println(StaticVsNonstatic5.pi);
		
		//Ŭ������.�޼ҵ�();
		int result1=StaticVsNonstatic5.plus(10, 20);
		int result2=StaticVsNonstatic5.minus(10, 20);
		System.out.println(result1);
		System.out.println(result2);
	
		//��ü����X
		//StaticVsNonstatic5 s = new StaticVsNonstatic5();
		//s.pi;
		//s.plus(10, 20);
		//s.minus(10, 20);
	}
}
