package day19;

public class StringEx4 {
	public static void main(String[] args) {
		//replace()
		String subject = "자바 프로그래밍 자바 프로그래밍";
		String subject2 = subject.replace("자바", "java");
		System.out.println(subject2);//java 프로그래밍 java 프로그래밍
		
		//toLowerCase() toUpperCase()
		String org = "Java Programming";
		String lower = org.toLowerCase();
		String upper = org.toUpperCase();
		System.out.println(lower);//java programming
		System.out.println(upper);//JAVA PROGRAMMING
		
		//trim()
		String tel1 = " 02";
		String tel2 = "123 ";
		String tel3 = "  1234  ";
		
		String tel = tel1.trim()+"-"+tel2.trim()+"-"+tel3.trim();
		System.out.println(tel);//02-123-1234
		
		//valueof()
		String str1 = String.valueOf(10);
		System.out.println(str1);//10
		String str2 = String.valueOf(10.1);
		System.out.println(str2);//10.1
	}
}
