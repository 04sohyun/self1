package day11;

public class Equals2 {
	public static void main(String[] args) {
		int a =10;
		int b = 10;
		
		System.out.println(a==b?"����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �����ϴ�.":"����Ÿ�� ���� a�� ����Ÿ�� ���� b�� ���� �����ϴ�.");
	
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1==str2?"str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �����ϴ�.":"str1�� �����ϴ� �ּҿ� str2�� �����ϴ� �ּҰ� �ٸ��ϴ�.");
		System.out.println(str1.equals(str2)?"str1�� ����� str2�� ������ �������� �����մϴ�.":"str1�� ����� str2�� ������ �������� �������� �ʽ��ϴ�.");
	}

}
