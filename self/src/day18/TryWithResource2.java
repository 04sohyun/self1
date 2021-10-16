package day18;

import java.util.Scanner;

public class TryWithResource2 {
	public static void main(String[] args) {
		//자원의 선언을 try()에서 선언
		//종료시 선언한 자원을 자동 해제
		//AutoCloseable인터페이스로 구현된 객체만 가능
		try(Scanner scanner = new Scanner(System.in)){
			String msg = scanner.next();
			System.out.println(msg);
			int number = scanner.nextInt();
			System.out.println(number);
		}catch(Exception e) {
			System.out.println("예외발생");
		}
	}
}