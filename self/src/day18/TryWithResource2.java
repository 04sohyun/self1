package day18;

import java.util.Scanner;

public class TryWithResource2 {
	public static void main(String[] args) {
		//�ڿ��� ������ try()���� ����
		//����� ������ �ڿ��� �ڵ� ����
		//AutoCloseable�������̽��� ������ ��ü�� ����
		try(Scanner scanner = new Scanner(System.in)){
			String msg = scanner.next();
			System.out.println(msg);
			int number = scanner.nextInt();
			System.out.println(number);
		}catch(Exception e) {
			System.out.println("���ܹ߻�");
		}
	}
}