package day12;

public class Method3 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.age = 20;
		t.name = "ȫ�浿";
		t.print();
	}
}

class Test2{
	//�ʵ�
	int age;
	String name;
	//�޼ҵ�
	void print(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}