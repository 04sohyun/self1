package day14;

public class Extends6 {
	public static void main(String[] args) {
		A3 a = new A3(3);
	}
	//�⺻������
	public Extends6() {
		System.out.println("�⺻������Extends6");
	}
	//�Ű������� �ִ� ������
	public Extends6(int x) {
		System.out.println("�θ�Ŭ������ �Ű�����������"+x);
	}
}

class A3 extends Extends6 {
	public A3() {
		System.out.println("������A3");
	}
	public A3(int x) {
		System.out.println("�ڽ�Ŭ������ �Ű�����������"+x);
	}
}