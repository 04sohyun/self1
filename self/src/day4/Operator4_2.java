package day4;

import java.util.Scanner;

public class Operator4_2 {

	public static void main(String[] args) {
		// �ʸ� ���� �Է¹޾Ƽ� ���
		
		int time;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� �ʸ� �Է��Ͻÿ�.");
		time = scanner.nextInt();
				
		
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		
		System.out.println(time+"�ʴ�");
		System.out.println(hour+"�ð�");
		System.out.println(minute+"��");
		System.out.println(second+"���Դϴ�.");
		
		
		
		

	}

}
