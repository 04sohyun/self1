package day9;

public class Copy4 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[5];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b:arr2) {
			System.out.print(b+" ");
		}
		System.out.println("\n------------");
		
		System.out.println("arr1의 hash코드값: "+arr1.hashCode());
		System.out.println("arr2의 hash코드값: "+arr2.hashCode());
		
	}

}
