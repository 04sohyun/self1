package day6;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score;
		System.out.println("점수를 입력하시오: ");
		score = scanner.nextInt();
		
		if(score>=80)
			System.out.println("축하합니다. 합격입니다.");
	}

}
