package day4;

import java.util.Scanner;

public class Operator4_2 {

	public static void main(String[] args) {
		// 초를 직접 입력받아서 사용
		
		int time;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계산할 초를 입력하시오.");
		time = scanner.nextInt();
				
		
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		
		System.out.println(time+"초는");
		System.out.println(hour+"시간");
		System.out.println(minute+"분");
		System.out.println(second+"초입니다.");
		
		
		
		

	}

}
