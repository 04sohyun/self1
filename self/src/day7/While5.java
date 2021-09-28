package day7;

import java.util.Scanner;

public class While5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0; int count = 0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int i = scanner.nextInt();
		
		while(i!=-1) {
			sum += i;
			count++;
			i = scanner.nextInt();
		}
		
		if(count==0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.println("합계:"+sum);
			System.out.println("정수의 개수는 "+count+"개입니다.");
			System.out.println("평균:"+sum/(double)count);
		}
	}

}
