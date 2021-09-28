package day7;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControl2 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		int speed = 0;
		
		while(run) {
			System.out.println("=================");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("=================");
			System.out.println("선택> ");
			
			int i = scanner.nextInt();
			if(i==1) {
				speed++;
				System.out.println("현재 속도는:"+speed);
			}else if(i==2) {
				speed--;
				System.out.println("현재 속도는:"+speed);
			}else if(i==3) {
				run = !run;
			}
			
		}
		System.out.println("중지");
	}

}
