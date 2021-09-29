package day8;

public class Array4 {
	public static void main(String[] args) {
		//배열 생성시 해당타입의 초기값으로 초기화됨.
		//기본타입은 0이나, 0.0, ' '로 초기화되어서 별도 초기화 	작업 없이도 연산문제없음
		//참조타입은 배열생성시 각 요소의 값이 null로 되어있으므로 null이 아닌 다른 값으로 초기화 해주어야함
		byte[] arrB = new byte[5];
		for(int i=0;i<arrB.length;i++) {
			System.out.print(arrB[i]+"\t");
		}
		System.out.println();
		char[] charA = new char[5];
		for(int i=0;i<charA.length;i++) {
			System.out.print(charA[i]+"\t");
		}
		System.out.println();
		short[] shortA = new short[5];
		for(int i=0;i<shortA.length;i++) {
			System.out.print(shortA[i]+"\t");
		}
		System.out.println();
		int[] intA = new int[5];
		for(int i=0;i<intA.length;i++) {
			System.out.print(intA[i]+"\t");
		}
		System.out.println();
		long[] longA = new long[5];
		for(int i=0;i<longA.length;i++) {
			System.out.print(longA[i]+"\t");
		}
		System.out.println();
		System.out.println("실수배열");
		float[] floatA = new float[5];
		for(int i=0;i<floatA.length;i++) {
			System.out.print(floatA[i]+"\t");
		}
		System.out.println();
		double[] doubleA = new double[5];
		for(int i=0;i<doubleA.length;i++) {
			System.out.print(doubleA[i]+"\t");
		}
		System.out.println();
		System.out.println("논리배열");
		boolean[] booleanA = new boolean[5];
		for(int i=0;i<booleanA.length;i++) {
			System.out.print(booleanA[i]+"\t");
		}
		System.out.println();
		System.out.println("참조배열");
		String[] stringA = new String[5];
		for(int i=0;i<stringA.length;i++) {
			System.out.print(stringA[i]+"\t");
		}
	}

}
