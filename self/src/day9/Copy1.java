package day9;

public class Copy1 {
	public static void main(String[] args) {
		int[] intArr1 = {1,2,3,4,5};
		
		//intArr1 �迭�� ���� �߰� ���ϹǷ� ���ο� �迭�� ����� ����
		int[] intArr2 = new int[6];
		
		//1.intArr1�迭�� ������ ����
		for(int i=0;i<intArr1.length;i++) {
			intArr2[i]=intArr1[i];
		}
		
		//2.intArr2�� �������� �ش簪�� ����
		//intArr2[5]=6; �Ǵ�
		intArr2[intArr2.length-1]=6;
		for(int s:intArr1)
			System.out.print(s+" ");
		System.out.println();
		for(int a:intArr2) {
			System.out.print(a+" ");
		}
		System.out.println("\n===========");
		
		//intArr2�迭�� �� ����
		intArr2[3] = 10;
		for(int s:intArr1)
			System.out.print(s+" ");
		System.out.println();
		for(int a:intArr2)
			System.out.print(a+" ");
	}

}
