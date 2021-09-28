package day7;

import java.util.Scanner;

public class DoWhile4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num; int i =1;
		
		do {
			System.out.println("2~9사이의 수를 입력하시오.");
			num = scanner.nextInt();
			if(num>=2 && num<=9) {
				do {
					System.out.println(num+"*"+i+"="+(num*i));
					i++;
				}while(i<=9);
			}
		}while(num>9 || num<2);
	}

}
