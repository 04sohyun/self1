package day16;

public class Interface2Main {
	public static void main(String[] args) {
		//�������̽��� �����ڸ� ȣ���ؼ� ��ü���� �Ұ�
		//Interface2 i2 = new Interface2();
		G2 g2 = new G2();
		G3 g3 = new G3();
		
		//�������̽�Ÿ������ �����ϰ� ��üŬ������ ��ü�� ���� 
		Interface2 i2 = g2;
		i2.a();
		//������
		i2 = g3;
		i2.a();
	
	}
}
