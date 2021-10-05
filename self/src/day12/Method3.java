package day12;

public class Method3 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.age = 20;
		t.name = "홍길동";
		t.print();
	}
}

class Test2{
	//필드
	int age;
	String name;
	//메소드
	void print(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}