package day5;

import java.util.Scanner;

public class ScannerExam1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸�, ����, ����, Ű, ���ſ��θ� �����ÿ�.");
		String name = scanner.next();
		System.out.println("�� �̸��� " + name+",");
		
		String city = scanner.next();
		System.out.println(city+"�� ���");
		
		int age = scanner.nextInt();
		System.out.println("���̴� "+age+"��");
		
		int tall = scanner.nextInt();
		System.out.println("Ű�� "+ tall+"cm");
		
		boolean single = scanner.nextBoolean();
		System.out.println("���� ���δ� "+single+"�Դϴ�.");
	}

}
