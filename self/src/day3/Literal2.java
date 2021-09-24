package day3;

public class Literal2 {

	public static void main(String[] args) {
		//실수 리터럴
		double d1 = 12.;
		double d2 = 12.0;
		double d3 = 0.1234;
		double d4 = 1234e-4; // e는 10을 의미
		double d5 = 1234E-4; //1234*10^-4
		double d6 = 1234e2; // 1234*10^2
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
		//실수리터럴 f는 32비트 범위, 실수리터럴 d는 2배정도 64비트 범위
		float f = 0.1234f;
		double w = .1234d;
		
		//float f2 = 0.1234; 실수는 기본적으로 double타입의 범위로 인식함
		//float f3 = 0.1234d; float타입의 범위보다 double타입의 범위가 큼
		double w2 = 0.1234f; // double타입의 범위보다 작으므로 가능
	}

}
