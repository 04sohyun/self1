package day14;

public class Extends4 {
	public static void main(String[] args) {
		A1 a = new A1();
	}
	//�⺻������
	public Extends4() {
		System.out.println("�⺻������Extends4");
	}
	//�Ű������� �ִ� ������
	public Extends4(int x) {
		System.out.println("�Ű�����������"+x);
	}
}

class A1 extends Extends4 {
	public A1() {
		System.out.println("������A1");
	}
}