package day3;

public class Literal4_0 {

	public static void main(String[] args) {
	//문자열 리터럴
		//영문, 한글 가능
		String str1 = "hello";
		String str2 = "안녕";
		
		//숫자형 문자열
		String str3 = "25";
		String str4 = "32.5";
		//숫자형 문자열을 숫자타입으로 변경 가능
		int n1 = Integer.parseInt(str3);
		double d1 = Double.parseDouble(str4);
		
		System.out.println(n1);
		System.out.println(d1);
		
		//문자하나 저장한 문자열
		String str5 = "a";
		
		String str6 = ""; //""사이 공백없어도 가능
		
		
	}

}
