package day7;

import java.util.Scanner;

public class DoWhile6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int ran = (int)(Math.random()*100)+1;
		int count = 1;
		
		do {
			System.out.println("1~100������ ���ڸ� �Է��Ͻÿ�.");
			int num = scanner.nextInt();
			if(num==ran) {
				System.out.println("�����մϴ�! "+count+"������ ������ϴ�.");
				break;
			}else if(num>ran) {
				System.out.println("�Է��� ���ڰ� �� Ů�ϴ�.");
			}else if(num<ran) {
				System.out.println("�Է��� ���ڰ� �� �۽��ϴ�.");
			}
			count++;
		}while(true);
	}

}
