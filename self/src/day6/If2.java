package day6;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.println("������ �Է��ϼ���(0~100)");
		score = scanner.nextInt();
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.println("������ "+grade+"�Դϴ�.");
	}

}
