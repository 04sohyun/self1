
package day10;

import java.util.Arrays;

public class Array2copy2 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		//System.arrayCopy() ����
		//java.lang.ArrayIndexOutOfBoundsException
		//System.arraycopy(oldStrArray, 1, newStrArray, 4, oldStrArray.length-1);
		//oldStrArray���� "array"�� "copy"�� newStrArray[4]���ķ� �����Ұǵ� "copy"�� �� ���� ��� �����߻�
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+" ");
		}

		System.out.println("\n-------------------------");
		int srcPos = 1;
		int num = oldStrArray.length - srcPos;//3-1=2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0;i<newStrArray.length;i++) 
			System.out.print(newStrArray[i]+" ");
	}
	}

