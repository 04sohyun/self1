package day6;

public class Switch7 {
	public static void main(String[] args) {
		//��1 ȭ2 ��3 ��4 ��5 ��6 ��0
		int day = (int)(Math.random()*7);
		
		switch(day) {
		case 1 : case 2 : case 3 : case 4 :
		System.out.println("������ �����մϴ�."); break;
		case 5 :
			System.out.println("������ �մϴ�."); break;
		case 6 : case 0 :
			System.out.println("�޽��� ���մϴ�."); break;
		}
	}

}
