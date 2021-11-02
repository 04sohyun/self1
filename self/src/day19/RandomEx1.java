package day19;

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		for(int i=0;i<6;i++) {
			selectNumber[i]=random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		Random random2 = new Random(5);
		boolean[] arr = new boolean[6];
		for(int i=0;i<6;i++) {
			arr[i]=random2.nextBoolean();
			System.out.print(arr[i]+" ");
		}
	}
}
