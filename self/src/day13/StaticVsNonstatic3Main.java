package day13;

public class StaticVsNonstatic3Main {
	public static void main(String[] args) {
		StaticVsNonstatic3 s1 = new StaticVsNonstatic3(10);
		StaticVsNonstatic3 s2 = new StaticVsNonstatic3(30);
		StaticVsNonstatic3 s3 = new StaticVsNonstatic3(20);
		
		System.out.println("ù��°�Һ�:"+s1.amount);
		System.out.println("�ι�°�Һ�:"+s2.amount);
		System.out.println("����°�Һ�:"+s3.amount);
		System.out.println("���� ������ ����:"+StaticVsNonstatic3.currentAmount);
	}

}
