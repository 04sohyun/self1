package day3;

public class Escape {

	public static void main(String[] args) {
		//escape문자 : 원래 글자로 표시되지 않고 \와 결합해서 특수 기능을 하는 문자들
		String message = "\"안녕하세요\" \n 저는 \t \"04sohyun\"입니다. \n c:\\temp";
		
		System.out.println(message);
		
		
		//오류 '\'다음의 문자는 특수용도의 문자로 변환
		//System.out.println("\");
		/* \다음의 u는 유니코드라는 의미를 표시하는 기능으로 사용됨 */
				
		System.out.println("\u0041");
		System.out.println("u");
				

	}

}
