package day6;

import java.util.Scanner;

public class If9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하시오. : ");
		int num = scanner.nextInt();
		
		if(num==12 || num==1 || num==2) {
			System.out.println("겨울");
		}else if(num==3 || num==4 || num==5) {
			System.out.println("봄");
		}else if(num==6 || num==7 || num==8) {
			System.out.println("여름");
		}else if(num==9 || num==10 || num==11) {
			System.out.println("가을");
		}else System.out.println("범위를 벗어났습니다.");
	}

}
