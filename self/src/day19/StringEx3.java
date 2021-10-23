package day19;

public class StringEx3 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍 자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		int index2 = subject.lastIndexOf("프로그래밍");
		System.out.println(index);//3
		System.out.println(index2);//12
		
		String fileName = "fff.sss.aa.jpg";
		int lastIndex = fileName.lastIndexOf(".");//10
		//substring(시작,끝); //substring(시작);
		String ext = fileName.substring(lastIndex+1);//11
		System.out.println(ext);//jpg
	}
}
