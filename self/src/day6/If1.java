package day6;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int number = scanner.nextInt();
		
		if(number%3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		
		//삼항연산식
		System.out.println((number%3==0)?"3의 배수입니다.":"3의 배수가 아닙니다.");
	}

}
