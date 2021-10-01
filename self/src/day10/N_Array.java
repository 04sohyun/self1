package day10;

public class N_Array {
	public static void main(String[] args) {
		//1차원 배열
		int[] arr1 = {1,2,3,4,5};
		
		//2차원 배열
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//3차원 배열
		int[][][] arr3 = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};

		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print(arr3[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
