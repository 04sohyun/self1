package day7;

import java.util.Scanner;

public class DoWhile6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ran = (int)(Math.random()*100)+1;
		int count = 1;
		
		do {
			System.out.println("1~100사이의 숫자를 입력하시오.");
			int num = scanner.nextInt();
			if(num==ran) {
				System.out.println("축하합니다! "+count+"번만에 맞췄습니다.");
				break;
			}else if(num>ran) {
				System.out.println("입력한 숫자가 더 큽니다.");
			}else if(num<ran) {
				System.out.println("입력한 숫자가 더 작습니다.");
			}
			count++;
		}while(true);
	}

}
