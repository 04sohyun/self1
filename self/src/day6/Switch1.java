package day6;

public class Switch1 {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8; //8<=time<12
				
		System.out.println("���� �ð��� "+time+"�� �Դϴ�.");
		switch(time) {
			case 8 : System.out.println("����� �մϴ�.");
			case 9 : System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10 : System.out.println("������ �մϴ�.");
			case 11 : System.out.println("�ܱ��� �����ϴ�.");
		}
	}

}
