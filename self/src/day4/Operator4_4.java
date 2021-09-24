package day4;

import java.util.Scanner;

public class Operator4_4 {

	public static void main(String[] args) {
		int x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		x = scanner.nextInt();
		
		if(x%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		

	}

}
