package day8;

public class Array4 {
	public static void main(String[] args) {
		//�迭 ������ �ش�Ÿ���� �ʱⰪ���� �ʱ�ȭ��.
		//�⺻Ÿ���� 0�̳�, 0.0, ' '�� �ʱ�ȭ�Ǿ ���� �ʱ�ȭ 	�۾� ���̵� ���깮������
		//����Ÿ���� �迭������ �� ����� ���� null�� �Ǿ������Ƿ� null�� �ƴ� �ٸ� ������ �ʱ�ȭ ���־����
		byte[] arrB = new byte[5];
		for(int i=0;i<arrB.length;i++) {
			System.out.print(arrB[i]+"\t");
		}
		System.out.println();
		char[] charA = new char[5];
		for(int i=0;i<charA.length;i++) {
			System.out.print(charA[i]+"\t");
		}
		System.out.println();
		short[] shortA = new short[5];
		for(int i=0;i<shortA.length;i++) {
			System.out.print(shortA[i]+"\t");
		}
		System.out.println();
		int[] intA = new int[5];
		for(int i=0;i<intA.length;i++) {
			System.out.print(intA[i]+"\t");
		}
		System.out.println();
		long[] longA = new long[5];
		for(int i=0;i<longA.length;i++) {
			System.out.print(longA[i]+"\t");
		}
		System.out.println();
		System.out.println("�Ǽ��迭");
		float[] floatA = new float[5];
		for(int i=0;i<floatA.length;i++) {
			System.out.print(floatA[i]+"\t");
		}
		System.out.println();
		double[] doubleA = new double[5];
		for(int i=0;i<doubleA.length;i++) {
			System.out.print(doubleA[i]+"\t");
		}
		System.out.println();
		System.out.println("���迭");
		boolean[] booleanA = new boolean[5];
		for(int i=0;i<booleanA.length;i++) {
			System.out.print(booleanA[i]+"\t");
		}
		System.out.println();
		System.out.println("�����迭");
		String[] stringA = new String[5];
		for(int i=0;i<stringA.length;i++) {
			System.out.print(stringA[i]+"\t");
		}
	}

}
