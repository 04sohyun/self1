package day6;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�");
		int score = scanner.nextInt();
		
		String grade;
		
		switch(score/10) {
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.printf("������ %d�̰� ������ %s�Դϴ�.", score, grade);
	}

}
