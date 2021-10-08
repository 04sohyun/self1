package day13;

public class StaticVsNonstatic3Main {
	public static void main(String[] args) {
		StaticVsNonstatic3 s1 = new StaticVsNonstatic3(10);
		StaticVsNonstatic3 s2 = new StaticVsNonstatic3(30);
		StaticVsNonstatic3 s3 = new StaticVsNonstatic3(20);
		
		System.out.println("첫번째소비량:"+s1.amount);
		System.out.println("두번째소비량:"+s2.amount);
		System.out.println("세번째소비량:"+s3.amount);
		System.out.println("현재 과일의 개수:"+StaticVsNonstatic3.currentAmount);
	}

}
