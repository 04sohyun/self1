package day19;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("ȫ�浿");
		Member m3 = new Member("������");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
	}
}
