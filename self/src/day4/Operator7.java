package day4;

public class Operator7 {
	public static void main(String[] args) {
		//����1
		int x = 5;
		int y = 3;
		
		int s;
		if(x>y) s=1;
		else s=-1;
		
		System.out.println(s);
		
		//����2
		s = x>y ? 1 : -1;
		System.out.println(s);
		
		//����3
		System.out.println("�� ���� ���� " + ((x>y)?(x-y):(y-x)) );	
		
		//����4
		//���� ? �� : (���� ? �� : ����)
		System.out.println("�� ���� ���� " + ((x>y) ? "x�� ũ��" : ((y>x) ? "y�� ũ��" : "����")));
		
	}

}
