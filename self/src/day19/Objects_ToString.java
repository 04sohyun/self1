package day19;

import java.util.Objects;

public class Objects_ToString {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = null;
		
		System.out.println(Objects.toString(s1));//홍길동
		System.out.println(Objects.toString(s2));//null
		System.out.println(Objects.toString(s2,"이름이 없습니다."));//이름이 없습니다.
	}
}
