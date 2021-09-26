package day6;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요(0~100): ");
		score = scanner.nextInt();
		
		int year;
		System.out.print("학년을 입력하세요(1~4): ");
		year = scanner.nextInt();
		
		if(score>=60) {
			if(year!=4) {
				System.out.println("합격!");
			}else if(score >=70) {
				System.out.println("합격!");
			}else {
				System.out.println("불합격!");
			}
		}else {
			System.out.println("불합격!");
		}
	}

}
