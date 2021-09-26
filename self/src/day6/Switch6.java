package day6;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요일을 입력하세요. : ");
		String day = scanner.next();
		
		switch(day) {
		case "월요일" : case "화요일" : case "수요일" : case "목요일" :
		System.out.println("열심히 공부합니다."); break;
		case "금요일" :
			System.out.println("쇼핑을 합니다."); break;
		case "토요일" : case "일요일" :
			System.out.println("휴식을 취합니다."); break;
		}
	}

}
