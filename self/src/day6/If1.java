package day6;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int number = scanner.nextInt();
		
		if(number%3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		
		//���׿����
		System.out.println((number%3==0)?"3�� ����Դϴ�.":"3�� ����� �ƴմϴ�.");
	}

}
