package day9;

public class Copy2 {
	public static void main(String[] args) {
		int[] intArr1 = {1,2,3,4,5};
		
		//intArr1�� �����ϴ� �ּҰ��� �����Ͽ� ����
		int[] intArr2 = intArr1;
		
		for(int s:intArr1)
			System.out.print(s+" ");
		System.out.println();
		for(int a:intArr2)
			System.out.print(a+" ");
		
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
