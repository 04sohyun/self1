package day13;

public class SingleTon2Main {
	public static void main(String[] args) {
		//multiton방식 - new 생성자();
		//SingleTon2 s1 = new SingleTon2(); - 생성자 private처리돼서 접근 못함
		//SingleTon2 s1 = SingleTon2.instance; - 클래스명.필드->자신타입도 private로 처리해서 접근못함
		
		//클래스명.메소드()호출
		SingleTon2 s1 = SingleTon2.getInstance();
		SingleTon2 s2 = SingleTon2.getInstance();
		
		System.out.println(s1==s2?"같은객체":"다른객체");
	}

}
