package day19;

public class MathEx1 {
	public static void main(String[] args) {
		//절대값
		System.out.println(Math.abs(5));//5
		System.out.println(Math.abs(-5));//5
		//올림값
		System.out.println(Math.ceil(5.3));//6.0
		//버림값
		System.out.println(Math.floor(5.3));//5.0
		//최대값, 최소값
		System.out.println(Math.max(10, 20));//20
		System.out.println(Math.min(10, 20));//10
		//가까운 정수의 실수값
		System.out.println(Math.rint(5.3));//5.0
		System.out.println(Math.rint(5.7));//6.0
		//반올림값
		System.out.println(Math.round(5.3));//5
		System.out.println(Math.round(5.7));//6
	}
}
