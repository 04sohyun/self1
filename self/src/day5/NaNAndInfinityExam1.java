package day5;

public class NaNAndInfinityExam1 {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		int i = 0;  
		
		double z = x/y;
		double z1 = x%y;
		
		System.out.println(Double.isInfinite(z));//실수의 몫의 연산결과가 infinity인지 여부 확인 //true
		System.out.println(Double.isNaN(z1));//실수의 나머지 연산결과가 숫자로 표현불가한지 체크 //true
		
		System.out.println(z+2); //Infinity
		System.out.println(z1+2); //NaN
		
		/* 오류(예외) 처리 구문 */
		try {
			System.out.println(x/i);//정수0으로 나누면 오류 발생
		}catch(Exception e) {
			System.out.println("정수 0으로 나누는 오류 발생");
		}
	}

}
