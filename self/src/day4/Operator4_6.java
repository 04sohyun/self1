package day4;

import java.util.Scanner;

public class Operator4_6 {

	public static void main(String[] args) {
		int x;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		x = scanner.nextInt();
		
		System.out.println("십의자리수:"+(x/10));
		System.out.println("일의자리수:"+(x%10));
	}

}
