package day10;

public class Array2_1 {
	public static void main(String[] args) {
		//2행 3열의 2차원 배열 생성{1,2,3,4,5,6}
		int[][] arr = new int[2][3];
		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		
		//arr.length의 값은 1차원 배열의 갯수를 의미함
		System.out.println("1차원배열의 갯수:"+arr.length);//2
		
		//arr[0].length의 값은 1차원배열의 요소수를 의미함
		System.out.println("1행의 1차원배열의 요소수:"+arr[0].length);//3
		System.out.println("2행의 1차원배열의 요소수:"+arr[1].length);//3
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
