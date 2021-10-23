package day19;

public class StringSplitEx1 {
	public static void main(String[] args) {
		String str = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = str.split("&|,|-");
		for(String name : names) {
			System.out.print(name+" ");
		}
	}
}
