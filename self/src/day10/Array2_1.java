package day10;

public class Array2_1 {
	public static void main(String[] args) {
		//2�� 3���� 2���� �迭 ����{1,2,3,4,5,6}
		int[][] arr = new int[2][3];
		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		
		//arr.length�� ���� 1���� �迭�� ������ �ǹ���
		System.out.println("1�����迭�� ����:"+arr.length);//2
		
		//arr[0].length�� ���� 1�����迭�� ��Ҽ��� �ǹ���
		System.out.println("1���� 1�����迭�� ��Ҽ�:"+arr[0].length);//3
		System.out.println("2���� 1�����迭�� ��Ҽ�:"+arr[1].length);//3
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
