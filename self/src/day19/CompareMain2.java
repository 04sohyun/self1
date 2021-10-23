package day19;

import java.util.Objects;

public class CompareMain2 {
	public static void main(String[] args) {
		Student1 s1 = new Student1("È«±æµ¿");
		Student1 s2 = new Student1("È«±æµ¿");
		Student1 s3 = new Student1("È«±æÀÌ");
		
		int result = Objects.compare(s1, s2, new StudentComparator2());
		System.out.println(result);//0
		
		result = Objects.compare(s1, s3, new StudentComparator2());
		System.out.println(result);//-5019
	}

}
