package day3;

public class Literal2 {

	public static void main(String[] args) {
		//�Ǽ� ���ͷ�
		double d1 = 12.;
		double d2 = 12.0;
		double d3 = 0.1234;
		double d4 = 1234e-4; // e�� 10�� �ǹ�
		double d5 = 1234E-4; //1234*10^-4
		double d6 = 1234e2; // 1234*10^2
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
		//�Ǽ����ͷ� f�� 32��Ʈ ����, �Ǽ����ͷ� d�� 2������ 64��Ʈ ����
		float f = 0.1234f;
		double w = .1234d;
		
		//float f2 = 0.1234; �Ǽ��� �⺻������ doubleŸ���� ������ �ν���
		//float f3 = 0.1234d; floatŸ���� �������� doubleŸ���� ������ ŭ
		double w2 = 0.1234f; // doubleŸ���� �������� �����Ƿ� ����
	}

}
