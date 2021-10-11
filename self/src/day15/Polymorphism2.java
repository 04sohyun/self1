package day15;

public class Polymorphism2 {
	public static void main(String[] args) {
		Polymorphism2 p;
		Student s = new Student("홍길동");
		p=s;//(promotion)
		
		System.out.println(p.name);
		
		//자식클래스에서 추가된 필드는 부모타입으로 형변환 후에 접근불가
		//p.grade="A";
		//p.department="Com";
		
		s=(Student) p; //(downcasting)
		
		//강제형변환 후 자식클래스의 필드와 메소드에 접근가능
		System.out.println(s.name);
		s.grade="A";
		s.department="Com";
	}
 String name;
 String id;
 public Polymorphism2(String name) {
	 this.name=name;
 }
}
class Student extends Polymorphism2{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}