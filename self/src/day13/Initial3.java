package day13;

public class Initial3 {
	public static void main(String[] args) {
		Block b1 = new Block();//static�ʱ�ȭ -> �ν��Ͻ��ʱ�ȭ -> ������
		Block b2 = new Block();//�ν��Ͻ��ʱ�ȭ -> ������
		Block b3 = new Block();//�ν��Ͻ��ʱ�ȭ -> ������
	}
}
class Block{
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
	}
	//static�ʱ�ȭ���� ���� Ŭ���� �ε�� �ѹ��� ����
	static {
		System.out.println("static �ʱ�ȭ ��");
	}
	
	Block(){System.out.println("������");}
}