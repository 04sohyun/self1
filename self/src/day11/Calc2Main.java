package day11;

import java.util.Scanner;

public class Calc2Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하시오.");
		System.out.println("첫번째 정수> ");
		int x = scanner.nextInt();
		System.out.println("두번째 정수> ");
		int y = scanner.nextInt();

		Calc2 calc = new Calc2();
		System.out.println(calc.add(x, y));
		System.out.println(calc.sub(x, y));
		
		
	}

}
