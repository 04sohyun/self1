package day7;

import java.util.Scanner;

public class DoWhile3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		do {
			System.out.println("¦���� �Է��Ͻÿ�.");
			num = scanner.nextInt();
		}while(num%2!=0);
		
		System.out.println("�Է��� ¦��:"+num);
	}

}
