
package day10;

import java.util.Arrays;

public class Array2copy3 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		//ArraysŬ������ copyof(�ҽ��迭, �����ұ���) �̿�
		String[] arr2 = Arrays.copyOf(oldStrArray, oldStrArray.length);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		arr2[0]="hi";
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<oldStrArray.length;i++) {
			System.out.print(oldStrArray[i]+" ");
		}
	
	}
}
