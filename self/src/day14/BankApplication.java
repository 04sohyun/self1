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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			
			int menu = scanner.nextInt();
			
			switch(menu) {
			case 1: createAccount(); break;
			case 2: listAccount(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: run = !run; break;
			}
			
			
		}
		System.out.println("���α׷� ����");
	}
	
	static void createAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account acc = new Account(ano, owner, balance);
		accountArray[index++] = acc;
		
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}
	
	static void listAccount() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
			}
		}
	}
	
	static void deposit() {
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("���ݾ�: ");
		int amount = scanner.nextInt();
		
		Account acc = findAccount(ano);
		
		if(acc!=null) {
			acc.setBalance(acc.getBalance()+amount);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("���: ���¸� Ȯ���ϼ���.");
		}
	}
	
	static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("��ݾ�: ");
		int amount = scanner.nextInt();
		
		Account acc = findAccount(ano);
		if(acc!=null) {
			if(acc.getBalance()-amount>=0) {
				acc.setBalance(acc.getBalance()-amount);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���: �ܰ� Ȯ���ϼ���.");
			}
		}else {
			System.out.println("���: ���¸� Ȯ���ϼ���.");
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
