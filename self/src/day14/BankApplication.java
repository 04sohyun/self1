package day14;

import java.util.Scanner;

public class BankApplication {
 static Scanner scanner = new Scanner(System.in);
 static Account[] accountArray = new Account[100];
 static int index=0;
 static boolean run = true;
 
	public static void main(String[] args) {
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1: createAccount(); break;
			case 2: listAccount(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: run = !run; break;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
	
	static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account acc = new Account(ano, owner, balance);
		accountArray[index++] = acc;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	static void listAccount() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
			}
		}
	}
	
	static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.println("예금액: ");
		int amount = scanner.nextInt();
		
		Account acc = findAccount(ano);
		
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+amount);
			System.out.println("결과: 예금이 성공되었습니다.");
		}else {
			System.out.println("결과: 계좌를 확인하세요.");
		}
	}
	
	static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.println("출금액: ");
		int amount = scanner.nextInt();
		
		Account acc = findAccount(ano);
		if(acc!=null) {
			if(acc.getBalance()-amount>=0) {
				acc.setBalance(acc.getBalance()-amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			}else {
				System.out.println("결과: 잔고를 확인하세요.");
			}
		}else {
			System.out.println("결과: 계좌를 확인하세요.");
		}
	}
	
	static  Account findAccount(String ano) {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
				}
			}
		}
		return null;
	}
}
