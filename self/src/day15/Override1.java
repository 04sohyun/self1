package day15;

public class Override1 {
	public static void main(String[] args) {
		A1 a1 = new A1(); a1.a();
		A2 a2 = new A2(); a2.a(); a2.a(7);

		//�ڽİ�ü�� �����Ͽ� �θ�Ÿ������ ����ȯ �� �޼ҵ� ����
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ�� �θ�Ŭ������ ����ȯ�ϴ��� ����� �����ǵ� �������� ����
		//�ڽ�Ŭ�������� �߰��� �޼ҵ�� �θ�Ŭ������ ����ȯ�� ����Ұ�(���� �θ�޼ҵ忡 �����⶧��)
		A1 a3 = new A2(); a3.a(); //a3.a(7);
	}
}

class A1{
	void a() {
		System.out.println("�θ� �޼ҵ�");
	}
}
//�������̵� �� �޼ҵ��, �Ű�����, ��ȯ���� ��ġ�ؾ��Ѵ�.
//���������ڴ� �ڽ��� �θ𺸴� �� �о�� �Ѵ�.
class A2 extends A1{
	public void a() {
		System.out.println("�ڽ� �޼ҵ�");
	}
	public void a(int k) {//�߰��� �޼ҵ�
		System.out.println("k method");
	}
}