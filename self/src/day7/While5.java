package day7;

import java.util.Scanner;

public class While5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0; int count = 0;
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int i = scanner.nextInt();
		
		while(i!=-1) {
			sum += i;
			count++;
			i = scanner.nextInt();
		}
		
		if(count==0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}else {
			System.out.println("�հ�:"+sum);
			System.out.println("������ ������ "+count+"���Դϴ�.");
			System.out.println("���:"+sum/(double)count);
		}
	}

}
