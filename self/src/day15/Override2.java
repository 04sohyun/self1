package day15;

public class Override2 {
	public static void main(String[] args) {
		A a = new A();
		a.method1();
	}
	public void method1() {
		System.out.println("�θ�޼ҵ�");
	}
}

class A extends Override2{
	//�θ�޼ҵ带 ����� ȿ��
	@Override
	public void method1() {
		System.out.println("�ڽĸ޼ҵ�");
	}
	
}