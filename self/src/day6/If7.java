package day6;

import java.util.Scanner;

public class If7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		String str ="";
		
		if(num<10) {
			if(num>=5) str = "5�̻� 10�̸�";
			else str="5�̸�";
		}
		else if(num<100) {
			if(num>=50) str = "50�̻� 100�̸�";
			else str = "10�̻� 50�̸�";
		}
		else if(num<1000) {
			if(num>=500) str = "500�̻� 1000�̸�";
			else str = "100�̻� 500�̸�";
		}
		else str = "1000�̻�";
		
		System.out.println(str+"�� ���Դϴ�.");
	}

}
