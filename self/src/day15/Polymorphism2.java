package day15;

public class Polymorphism2 {
	public static void main(String[] args) {
		Polymorphism2 p;
		Student s = new Student("ȫ�浿");
		p=s;//(promotion)
		
		System.out.println(p.name);
		
		//�ڽ�Ŭ�������� �߰��� �ʵ�� �θ�Ÿ������ ����ȯ �Ŀ� ���ٺҰ�
		//p.grade="A";
		//p.department="Com";
		
		s=(Student) p; //(downcasting)
		
		//��������ȯ �� �ڽ�Ŭ������ �ʵ�� �޼ҵ忡 ���ٰ���
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