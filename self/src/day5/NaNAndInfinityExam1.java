package day5;

public class NaNAndInfinityExam1 {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		int i = 0;  
		
		double z = x/y;
		double z1 = x%y;
		
		System.out.println(Double.isInfinite(z));//�Ǽ��� ���� �������� infinity���� ���� Ȯ�� //true
		System.out.println(Double.isNaN(z1));//�Ǽ��� ������ �������� ���ڷ� ǥ���Ұ����� üũ //true
		
		System.out.println(z+2); //Infinity
		System.out.println(z1+2); //NaN
		
		/* ����(����) ó�� ���� */
		try {
			System.out.println(x/i);//����0���� ������ ���� �߻�
		}catch(Exception e) {
			System.out.println("���� 0���� ������ ���� �߻�");
		}
	}

}
