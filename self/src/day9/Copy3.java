package day9;

public class Copy3 {
	public static void main(String[] args) {
		//��������
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b:arr2) {
			System.out.print(b+" ");
		}
		System.out.println("\n------------");
		
		//������.hashCode()
		//��ü�� ����� �ּҰ��� �ؽ����������� ����� ������ ��ü�� ���� ������ �ٸ��� ������ �� ���
		System.out.println("arr1�� hash�ڵ尪: "+arr1.hashCode());
		System.out.println("arr2�� hash�ڵ尪: "+arr2.hashCode());
		
	}

}
