package day19;

import java.util.Objects;

public class NullEx {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = null;
		
		System.out.println(Objects.isNull(s1));//false
		System.out.println(Objects.isNull(s2));//true
		
		System.out.println(Objects.nonNull(s1));//true
		System.out.println(Objects.nonNull(s2));//false
		
		System.out.println(Objects.requireNonNull(s1));//홍길동
		System.out.println(Objects.requireNonNull(s2));//예외발생
		System.out.println(Objects.requireNonNull(s2,"이름이 없습니다."));//예외발생 후 메세지 출력
		
		
	}
}
