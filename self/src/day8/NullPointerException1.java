package day8;

public class NullPointerException1 {
	public static void main(String[] args) {
		//���α׷� ������ ���� �߻�
		int[] intArray = null;//��ü �������� ���� �ϰ� ���� ��ü�� �������� ����
		intArray[0] = 10;
		
		
		String str = null;//��ü �������� ���� �ϰ� ���� ��ü�� �������� ����
		System.out.println("�� ���ڼ�:"+str.length());
	}

}
