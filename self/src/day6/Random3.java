package day6;

import java.util.HashSet;
import java.util.Set;

public class Random3 {
	public static void main(String[] args) {
		//중복되지않은 정수를 저장하는 저장소 set에 값 저장
		Set<Integer> lottoes = new HashSet<Integer>();
				
		while(lottoes.size()<6) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
			lottoes.add(num);//set에 값 저장
		}
		System.out.println(lottoes);
				
		
	}

}
