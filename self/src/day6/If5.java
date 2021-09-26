package day6;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요: ");
		score = scanner.nextInt();
		
		String grade;
		
		if(score >= 90) grade = "A";
		else if(score>=80) grade = "B";
		else if(score>=70) grade = "C";
		else if(score>=60) grade = "D";
		else grade = "F";
		
		System.out.printf("점수는 %d이고 학점은 %s입니다.", score, grade);
	}

}
