package day19;

public class MemberMain3 {
	public static void main(String[] args) {
		Member3 m1 = new Member3("ȫ�浿",18);
		Member3 m2 = new Member3("ȫ�浿",18);
		Member3 m3 = new Member3("������",18);
		Member3 m4 = new Member3("ȫ�浿",35);
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		System.out.println(m1.equals(m2));//true
		System.out.println(m1.equals(m3));//false
	}
}
