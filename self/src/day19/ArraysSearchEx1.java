package day19;

import java.util.Arrays;

public class ArraysSearchEx1 {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£Àº ÀÎµ¦½º:"+index);//2
		
		Member5 m1 = new Member5("È«±æµ¿");
		Member5 m2 = new Member5("¹Úµ¿¼ö");
		Member5 m3 = new Member5("±è¹Î¼ö");
		Member5[] members = {m1,m2,m3};
		
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("Ã£Àº ÀÎµ¦½º:"+index);//2
		System.out.println(members[index].name);//È«±æµ¿
	}
}
