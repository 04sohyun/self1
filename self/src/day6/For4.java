package day6;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���?");
		int num = scanner.nextInt();
		
		System.out.println("������ "+num+"��");
		for(int i=1;i<10;i++) {
			System.out.print(num+ "*" + i + "="+ num*i+"\t");
		}
	}

}
