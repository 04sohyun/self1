package day19;

import java.util.Objects;

public class NullEx {
	public static void main(String[] args) {
		String s1 = "ȫ�浿";
		String s2 = null;
		
		System.out.println(Objects.isNull(s1));//false
		System.out.println(Objects.isNull(s2));//true
		
		System.out.println(Objects.nonNull(s1));//true
		System.out.println(Objects.nonNull(s2));//false
		
		System.out.println(Objects.requireNonNull(s1));//ȫ�浿
		System.out.println(Objects.requireNonNull(s2));//���ܹ߻�
		System.out.println(Objects.requireNonNull(s2,"�̸��� �����ϴ�."));//���ܹ߻� �� �޼��� ���
		
		
	}
}
