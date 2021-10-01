package day9;

public class Copy5 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		int[] arr3 = new int[arr1.length+arr2.length];
		
		//1. arr1배열 복사
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		//2. arr2배열 복사
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		for(int a:arr3) {
			System.out.print(a+" ");
		}
		
	}

}
