package day19;

import java.util.Objects;

public class Objects_ToString {
	public static void main(String[] args) {
		String s1 = "ȫ�浿";
		String s2 = null;
		
		System.out.println(Objects.toString(s1));//ȫ�浿
		System.out.println(Objects.toString(s2));//null
		System.out.println(Objects.toString(s2,"�̸��� �����ϴ�."));//�̸��� �����ϴ�.
	}
}
