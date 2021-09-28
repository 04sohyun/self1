package day7;

import java.util.Scanner;

public class Continue4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("정수를 입력하시오.");
		
		for(int i=0;i<5;i++) {
			num = scanner.nextInt();
			if(num>0)	sum+=num;
			else continue;
		}
		System.out.println("양수들의 합:"+sum);
	}

}
