package day14;

public class Extends8 {
	public static void main(String[] args) {
		A5 a = new A5();
	}
	//�⺻������
	public Extends8() {
		System.out.println("�⺻������Extends8");
	}
	//�Ű������� �ִ� ������
	public Extends8(int x) {
		System.out.println("�θ�Ŭ������ �Ű�����������"+x);
	}
}

class A5 extends Extends8 {
	public A5() {
		super(5);
		System.out.println("������A5");
	}
	
}