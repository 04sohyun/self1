package day13;

import java.util.Scanner;

public class Final_Person2 {
//final필드는 선언과 동시에 초기화
  final String nation = "Korea";
//생성자에서 final필드를 초기화 할 수 있는 경우 선언만해도 오류발생X
  final String ssn;
  String name;
//생성자에 final필드를 초기화하는 명령문 포함
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
			System.out.println("주민번호: ");
			String ssn = scanner.next();
			System.out.println("이름: ");
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
