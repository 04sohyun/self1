package day13;

public class Final_Person1 {
//final필드는 선언과 동시에 초기화
  final String nation = "Korea";
//생성자에서 final필드를 초기화 할 수 있는 경우 선언만해도 오류발생X
  final String ssn;
  String name;
//생성자에 final필드를 초기화하는 명령문 포함
  public Final_Person1(String ssn, String name) {
	  this.ssn=ssn;
	  this.name=name;
  }
	
	public static void main(String[] args) {
		Final_Person1 person = new Final_Person1("20010101-1234567","홍길동");
		//person.nation = "USA";
		//person.ssn = "1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}
}
