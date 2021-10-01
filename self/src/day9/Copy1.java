package day9;

public class Copy1 {
	public static void main(String[] args) {
		int[] intArr1 = {1,2,3,4,5};
		
		//intArr1 배열에 새로 추가 못하므로 새로운 배열을 만들어 복사
		int[] intArr2 = new int[6];
		
		//1.intArr1배열의 내용을 복사
		for(int i=0;i<intArr1.length;i++) {
			intArr2[i]=intArr1[i];
		}
		
		//2.intArr2의 마지막에 해당값을 저장
		//intArr2[5]=6; 또는
		intArr2[intArr2.length-1]=6;
		for(int s:intArr1)
			System.out.print(s+" ");
		System.out.println();
		for(int a:intArr2) {
			System.out.print(a+" ");
		}
		System.out.println("\n===========");
		
		//intArr2배열의 값 변경
		intArr2[3] = 10;
		for(int s:intArr1)
			System.out.print(s+" ");
		System.out.println();
		for(int a:intArr2)
			System.out.print(a+" ");
	}

}
