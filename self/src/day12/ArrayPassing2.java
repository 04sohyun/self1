package day12;

public class ArrayPassing2 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};//[1][2][3][4][5]
		
		increase(a);
		System.out.println("a�迭�� ��Ұ�");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void increase(int[] array) {
		
		int[] newArr = new int[array.length];
		for(int i=0;i<array.length;i++) {
			newArr[i]=array[i];
		}
		for(int i=0;i<newArr.length;i++) {//[2][3][4][5][6]
			newArr[i]++;
		}
		System.out.println("newArr�迭�� ��Ұ�");
		for(int i:newArr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
