package day14;

public class Extends7 {
	public static void main(String[] args) {
		A4 a = new A4(3);
	}
	//�⺻������
	public Extends7() {
		System.out.println("�⺻������Extends7");
	}
	//�Ű������� �ִ� ������
	public Extends7(int x) {
		System.out.println("�θ�Ŭ������ �Ű�����������"+x);
	}
}

class A4 extends Extends7 {
	public A4() {
		System.out.println("������A4");
	}
	public A4(int x) {
		super(x);
		System.out.println("�ڽ�Ŭ������ �Ű�����������"+x);
	}
}