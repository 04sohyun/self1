package day13;

import java.util.Scanner;

public class Final_Person2 {
//final�ʵ�� ����� ���ÿ� �ʱ�ȭ
  final String nation = "Korea";
//�����ڿ��� final�ʵ带 �ʱ�ȭ �� �� �ִ� ��� �����ص� �����߻�X
  final String ssn;
  String name;
//�����ڿ� final�ʵ带 �ʱ�ȭ�ϴ� ��ɹ� ����
  public Final_Person2(String ssn, String name) {
	  this.ssn=ssn;
	  this.name=name;
  }
	
	public static void main(String[] args) {
		Final_Person2[] persons = new Final_Person2[1000];
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int index=0;
		while(run) {
			System.out.println("�ֹι�ȣ: ");
			String ssn = scanner.next();
			System.out.println("�̸�: ");
			String name = scanner.next();
			Final_Person2 person = new Final_Person2(ssn,name); 
			persons[index++]=person;
		
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		if(index==3) run = !run;
		}
	}
}
