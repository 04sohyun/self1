package day11;

import java.util.Scanner;

public class Equals1 {
	public static void main(String[] args) {
		//1. id="hong",pwd="1234"
		//id�� pwd�� scanner�� �Է¹޾Ƽ� id�� pwd�� �� �� ������ "login����"
		//�ƴϸ� "1ȸ �����Ͽ����ϴ�."���
		//5ȸ �����ϸ�, "5ȸ �����Ͽ����ϴ� ���α׷��� �����մϴ�." ��� �� ����
		
		Scanner scanner= new Scanner(System.in);
		 int cnt=0;
		 
		 while(true) {
		 if(cnt==5){
			 System.out.println(cnt+"ȸ �����Ͽ����ϴ�. ���α׷��� ���� �մϴ�."); break;
		 }
		 System.out.print("id> ");
		 String id = scanner.next();
		 System.out.print("pwd> ");
		 String pwd = scanner.next();
		 if("hong".equals(id) && "1234".equals(pwd)) {
			System.out.println("login����");
			break;
		}else {
			cnt++;
			if(cnt!=5)
			System.out.println(cnt+"ȸ �����Ͽ����ϴ�.");
		}
		
		 }
 }
}
