
package day10;

import java.util.Arrays;

public class Array2copy1 {
	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		//for문 이용
		System.out.println("for문 이용");
		for(int i=0;i<oldStrArray.length;i++) {
			newStrArray[i]=oldStrArray[i];
			System.out.print(newStrArray[i]+" ");
		}
		
		//System.arrayCopy()이용
		System.out.println("\n\nSystem.arrayCopy()이용");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+" ");
		}

		//Arrays클래스의 copyof(소스배열, 복사할길이) 이용
		System.out.println("\n\nArrays클래스의 copyof(소스배열, 복사할길이) 이용");
		newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+" ");
		}
	}
}
