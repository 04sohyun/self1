package day10;

import java.util.Scanner;

public class EnumMethod1 {
	public static void main(String[] args) {
		//name()메소드 - 열거 객체의 문자열을 리털
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()메소드 - 열거 객체의 순번을 리턴
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()메소드 - 열거 객체를 비교해서 순번차이를 리턴
		Week day1 = Week.THURSDAY;
		Week day2 = Week.SUNDAY;
		int result1 = day1.compareTo(day2);//3-6
		int result2 = day2.compareTo(day1);//6-3
		System.out.println(result1);
		System.out.println(result2);
		
		//valueof()메소드 - 주어진 문자열의 열거 객체를 리턴
		System.out.println("요일을 열거상수 형식으로 입력");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		Week weekDay = Week.valueOf(day);
	
		if(weekDay==Week.SATURDAY || weekDay==Week.SUNDAY) {
			System.out.println("주말이군요");
		}else {
			System.out.println("평일이군요");
		}
		
		/*
		switch(weekDay.ordinal()) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("평일이군요"); break;
		case 5:
		case 6:System.out.println("주말이군요"); break;
		}*/
		
		
		//values()메소드 - 모든 열거 객체들을 배열로 리턴
		Week[] days = Week.values();
		for(int i=0;i<days.length;i++) {
			System.out.print(days[i]+" ");
		}
		System.out.println();
		for(Week s:days) {
			System.out.print(s+" ");
		}
		
	}

}
