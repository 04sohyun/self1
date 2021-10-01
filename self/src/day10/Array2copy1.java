
package day10;

import java.util.Arrays;

public class Array2copy1 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		//for�� �̿�
		System.out.println("for�� �̿�");
		for(int i=0;i<oldStrArray.length;i++) {
			newStrArray[i]=oldStrArray[i];
			System.out.print(newStrArray[i]+" ");
		}
		
		//System.arrayCopy()�̿�
		System.out.println("\n\nSystem.arrayCopy()�̿�");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+" ");
		}

		//ArraysŬ������ copyof(�ҽ��迭, �����ұ���) �̿�
		System.out.println("\n\nArraysŬ������ copyof(�ҽ��迭, �����ұ���) �̿�");
		newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+" ");
		}
	}
}
