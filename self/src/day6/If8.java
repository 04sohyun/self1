package day6;

import java.util.Scanner;

public class If8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. : ");
		int score = scanner.nextInt();
		String grade;
		
		if(score>=90) {
			grade = "A";
			if(score<95) grade += "-";
			else if(score==95) grade += "0";
			else grade +="+";
 		}
		else if(score>=80) {
			grade = "B";
			if(score<85) grade += "-";
			else if(score==85) grade += "0";
			else grade +="+";
		}
		else if(score>=70) {
			grade = "C";
			if(score<75) grade += "-";
			else if(score==75) grade += "0";
			else grade +="+";
		}
		else if(score>=60) {
			grade = "D";
			if(score<65) grade += "-";
			else if(score==65) grade += "0";
			else grade +="+";
		}
		else grade = "F";
		
		System.out.println("������ "+grade);
		System.out.printf("������ %d�̰� ������ %s�Դϴ�.", score, grade);
	}

}
