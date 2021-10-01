
package day10;

import java.util.Arrays;

public class Array2copy2 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		//System.arrayCopy() 오류
		//java.lang.ArrayIndexOutOfBoundsException
		//System.arraycopy(oldStrArray, 1, newStrArray, 4, oldStrArray.length-1);
		//oldStrArray에서 "array"와 "copy"를 newStrArray[4]이후로 복사할건데 "copy"가 들어갈 공간 없어서 오류발생
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

