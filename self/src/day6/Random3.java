package day6;

import java.util.HashSet;
import java.util.Set;

public class Random3 {
	public static void main(String[] args) {
		//�ߺ��������� ������ �����ϴ� ����� set�� �� ����
		Set<Integer> lottoes = new HashSet<Integer>();
				
		while(lottoes.size()<6) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
			lottoes.add(num);//set�� �� ����
		}
		System.out.println(lottoes);
				
		
	}

}
