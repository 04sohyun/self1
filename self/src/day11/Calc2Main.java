package day11;

import java.util.Scanner;

public class Calc2Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�.");
		System.out.println("ù��° ����> ");
		int x = scanner.nextInt();
		System.out.println("�ι�° ����> ");
		int y = scanner.nextInt();

		Calc2 calc = new Calc2();
		System.out.println(calc.add(x, y));
		System.out.println(calc.sub(x, y));
		
		
	}

}
