package day6;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("������ �Է��ϼ���(0~100): ");
		score = scanner.nextInt();
		
		int year;
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		year = scanner.nextInt();
		
		if(score>=60) {
			if(year!=4) {
				System.out.println("�հ�!");
			}else if(score >=70) {
				System.out.println("�հ�!");
			}else {
				System.out.println("���հ�!");
			}
		}else {
			System.out.println("���հ�!");
		}
	}

}
