package day6;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력하시오");
		int score = scanner.nextInt();
		
		String grade;
		
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.printf("성적은 %d이고 학점은 %s입니다.", score, grade);
	}

}
