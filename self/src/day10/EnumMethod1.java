package day10;

import java.util.Scanner;

public class EnumMethod1 {
	public static void main(String[] args) {
		//name()�޼ҵ� - ���� ��ü�� ���ڿ��� ����
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()�޼ҵ� - ���� ��ü�� ������ ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()�޼ҵ� - ���� ��ü�� ���ؼ� �������̸� ����
		Week day1 = Week.THURSDAY;
		Week day2 = Week.SUNDAY;
		int result1 = day1.compareTo(day2);//3-6
		int result2 = day2.compareTo(day1);//6-3
		System.out.println(result1);
		System.out.println(result2);
		
		//valueof()�޼ҵ� - �־��� ���ڿ��� ���� ��ü�� ����
		System.out.println("������ ���Ż�� �������� �Է�");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.next();
		Week weekDay = Week.valueOf(day);
	
		if(weekDay==Week.SATURDAY || weekDay==Week.SUNDAY) {
			System.out.println("�ָ��̱���");
		}else {
			System.out.println("�����̱���");
		}
		
		/*
		switch(weekDay.ordinal()) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("�����̱���"); break;
		case 5:
		case 6:System.out.println("�ָ��̱���"); break;
		}*/
		
		
		//values()�޼ҵ� - ��� ���� ��ü���� �迭�� ����
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
