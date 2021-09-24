package day3;

public class Literal1 {

	public static void main(String[] args) {
		//정수 리터럴
		//10진수, 8진수, 16진수, 2진수
		int n = 15; //정수타입 변수를 선언하고 10진수 리터럴 15를 대입
		int m = 015; //정수타입 변수를 선언하고 0으로 시작되는 8진수 015를 대입
		int k = 0x15; //정수타입 변수를 선언하고 0x로 시작되는 16진수 0x15 대입
		int b = 0b0101; //정수타입 변수를 선언하고 2진수 대입
		
		System.out.println(n); 
		System.out.println(m); 
		System.out.println(k); 
		System.out.println(b); 

		
		//2배수 정수
		//long타입은 리터럴 뒤에 L이나 l을 붙임
		long l1 = 24L;
	}

}
