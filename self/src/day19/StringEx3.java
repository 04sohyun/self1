package day19;

public class StringEx3 {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷��� �ڹ� ���α׷���";
		int index = subject.indexOf("���α׷���");
		int index2 = subject.lastIndexOf("���α׷���");
		System.out.println(index);//3
		System.out.println(index2);//12
		
		String fileName = "fff.sss.aa.jpg";
		int lastIndex = fileName.lastIndexOf(".");//10
		//substring(����,��); //substring(����);
		String ext = fileName.substring(lastIndex+1);//11
		System.out.println(ext);//jpg
	}
}
