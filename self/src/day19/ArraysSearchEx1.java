package day19;

import java.util.Arrays;

public class ArraysSearchEx1 {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���:"+index);//2
		
		Member5 m1 = new Member5("ȫ�浿");
		Member5 m2 = new Member5("�ڵ���");
		Member5 m3 = new Member5("��μ�");
		Member5[] members = {m1,m2,m3};
		
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���:"+index);//2
		System.out.println(members[index].name);//ȫ�浿
	}
}
