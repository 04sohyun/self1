package day10;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		//스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92};
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int score[] = new int[8];
		int sum = 0;
		int temp = 0;
		
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.성적입력 | 2.합과 평균 출력 | 3.성적순 출력 | 4.종료");
			System.out.println("-----------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("1.성적입력>");
				for(int i=0;i<score.length;i++){
					score[i]=scanner.nextInt();
					System.out.print(score[i]+" ");
				}
				System.out.println();
				break;
			case 2: 
				System.out.println("2.합과 평균 출력");
				for(int i=0;i<score.length;i++) {
					sum += score[i];
				}
				System.out.println("합계: "+sum);
				System.out.println("평균: "+sum/(double)score.length);
				break;
			case 3:
				System.out.println("3.성적순 출력");
				for(int i=0;i<score.length;i++) {
					for(int j=i+1;j<score.length;j++) {
						if(score[i]>score[j]) {
							temp = score[i];
							score[i]=score[j];
							score[j]=temp;
						}
					}
				}
				for(int s:score) {
					System.out.print(s+" ");
				}
				System.out.println();
				break;
			case 4:
				run = !run;
			}
			
			
			
		}
		System.out.println("프로그램 종료");
	}

}
