package day8;

public class NullPointerException1 {
	public static void main(String[] args) {
		//프로그램 실행중 예외 발생
		int[] intArray = null;//객체 참조변수 선언만 하고 실제 객체를 생성하지 않음
		intArray[0] = 10;
		
		
		String str = null;//객체 참조변수 선언만 하고 실제 객체를 생성하지 않음
		System.out.println("총 문자수:"+str.length());
	}

}
