package day11;

import java.util.Scanner;

public class Equals1 {
	public static void main(String[] args) {
		//1. id="hong",pwd="1234"
		//id와 pwd를 scanner로 입력받아서 id와 pwd가 둘 다 같으면 "login성공"
		//아니면 "1회 실패하였습니다."출력
		//5회 실패하면, "5회 실패하였습니다 프로그램을 종료합니다." 출력 후 종료
		
		Scanner scanner= new Scanner(System.in);
		 int cnt=0;
		 
		 while(true) {
		 if(cnt==5){
			 System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다."); break;
		 }
		 System.out.print("id> ");
		 String id = scanner.next();
		 System.out.print("pwd> ");
		 String pwd = scanner.next();
		 if("hong".equals(id) && "1234".equals(pwd)) {
			System.out.println("login성공");
			break;
		}else {
			cnt++;
			if(cnt!=5)
			System.out.println(cnt+"회 실패하였습니다.");
		}
		
		 }
 }
}
