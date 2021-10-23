package day19;

import java.util.Arrays;

public class ArraysSortEx1 {
	public static void main(String[] args) {
		Member5 m1 = new Member5("È«±æµ¿");
		Member5 m2 = new Member5("¹Úµ¿¼ö");
		Member5 m3 = new Member5("±è¹Î¼ö");
		Member5[] members = {m1,m2,m3};
		
		for(Member5 m:members)
			System.out.println(m);
		
		System.out.println("¿À¸§Â÷¼øÁ¤·Ä");
		Arrays.sort(members);
		for(Member5 m : members)
			System.out.println(m);
		
	}
}
class Member5 implements Comparable<Member5>{
	String name;
	
	public Member5(String name) {this.name = name;}

	@Override
	public int compareTo(Member5 o) {
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Member5 [name=" + name + "]";
	}
}