package day19;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("È«±æµ¿");
		Member m2 = new Member("È«±æµ¿");
		Member m3 = new Member("ÀÏÁö¸Å");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
	}
}
