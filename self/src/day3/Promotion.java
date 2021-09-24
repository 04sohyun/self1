package day3;

public class Promotion {

	public static void main(String[] args) {
		//자동 타입 변환
		
		byte a = 10;
		int value1 = a; //자동으로 타입 변환
		
		double result = 3 + 15.4; // 정수 + 실수 -> 실수 + 실수 -> 실수
		
		char c = 'A'; 
		int value2 = c;
		
		System.out.println(value1);
		System.out.println(result);
		System.out.println(value2);

	}

}
