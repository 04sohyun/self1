package day5;

import java.util.Scanner;

public class ScannerExam1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름, 도시, 나이, 키, 독신여부를 적으시오.");
		String name = scanner.next();
		System.out.println("제 이름은 " + name+",");
		
		String city = scanner.next();
		System.out.println(city+"에 살며");
		
		int age = scanner.nextInt();
		System.out.println("나이는 "+age+"살");
		
		int tall = scanner.nextInt();
		System.out.println("키는 "+ tall+"cm");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신 여부는 "+single+"입니다.");
	}

}
