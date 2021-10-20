package day19;

public class MemberMain2 {
	public static void main(String[] args) {
		Member2 m1 = new Member2(2001001);
		Member2 m2 = new Member2(2001001);
		Member2 m3 = new Member2(19970426);
		
		System.out.println(m1.equals(m2));//true
		System.out.println(m1.equals(m3));//false
	}
}
