package day5;

import java.util.Scanner;

public class NaNExam1 {
	public static void main(String[] args) {
		//String input = "NaN";
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println("�Ǽ��� �Է��Ͻÿ�.");
		input = scanner.next();
		
		double val = Double.valueOf(input);
		
		double currentBalance = 1000.0;
		
		if(Double.isNaN(Double.valueOf(input))) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
		}else {
			currentBalance += val;
			System.out.println(currentBalance);
		}
	}

}
