package day10;

public class Array2_2 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2},{4,5,6}};
		
		System.out.println("1차원배열의 갯수:"+arr.length);//2
		
		System.out.println("1행의 1차원배열의 요소수:"+arr[0].length);//2
		System.out.println("2행의 1차원배열의 요소수:"+arr[1].length);//3
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//향상된 for문 이용
			for(int[] a:arr) {
				for(int a1:a) {
					System.out.print(a1+" ");
				}
				System.out.println();
			}
		
	}

}
