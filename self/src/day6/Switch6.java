package day6;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		String day = scanner.next();
		
		switch(day) {
		case "������" : case "ȭ����" : case "������" : case "�����" :
		System.out.println("������ �����մϴ�."); break;
		case "�ݿ���" :
			System.out.println("������ �մϴ�."); break;
		case "�����" : case "�Ͽ���" :
			System.out.println("�޽��� ���մϴ�."); break;
		}
	}

}
