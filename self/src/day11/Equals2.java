package day11;

public class Equals2 {
	public static void main(String[] args) {
		int a =10;
		int b = 10;
		
		System.out.println(a==b?"정수타입 변수 a와 정수타입 변수 b의 값이 같습니다.":"정수타입 변수 a와 정수타입 변수 b의 값이 같습니다.");
	
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1==str2?"str1이 참조하는 주소와 str2가 참조하는 주소가 같습니다.":"str1이 참조하는 주소와 str2가 참조하는 주소가 다릅니다.");
		System.out.println(str1.equals(str2)?"str1의 내용과 str2의 내용이 논리적으로 동등합니다.":"str1의 내용과 str2의 내용이 논리적으로 동등하지 않습니다.");
	}

}
