package day13;

public class Final_Person1 {
//final�ʵ�� ����� ���ÿ� �ʱ�ȭ
  final String nation = "Korea";
//�����ڿ��� final�ʵ带 �ʱ�ȭ �� �� �ִ� ��� �����ص� �����߻�X
  final String ssn;
  String name;
//�����ڿ� final�ʵ带 �ʱ�ȭ�ϴ� ��ɹ� ����
  public Final_Person1(String ssn, String name) {
	  this.ssn=ssn;
	  this.name=name;
  }
	
	public static void main(String[] args) {
		Final_Person1 person = new Final_Person1("20010101-1234567","ȫ�浿");
		//person.nation = "USA";
		//person.ssn = "1234";
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
	}
}
