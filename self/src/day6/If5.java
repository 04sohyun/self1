package day6;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("������ �Է��ϼ���: ");
		score = scanner.nextInt();
		
		String grade;
		
		if(score >= 90) grade = "A";
		else if(score>=80) grade = "B";
		else if(score>=70) grade = "C";
		else if(score>=60) grade = "D";
		else grade = "F";
		
		System.out.printf("������ %d�̰� ������ %s�Դϴ�.", score, grade);
	}

}
