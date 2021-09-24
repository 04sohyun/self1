package day4;

public class Operator7 {
	public static void main(String[] args) {
		//조건1
		int x = 5;
		int y = 3;
		
		int s;
		if(x>y) s=1;
		else s=-1;
		
		System.out.println(s);
		
		//조건2
		s = x>y ? 1 : -1;
		System.out.println(s);
		
		//조건3
		System.out.println("두 수의 차는 " + ((x>y)?(x-y):(y-x)) );	
		
		//조건4
		//조건 ? 참 : (조건 ? 참 : 거짓)
		System.out.println("두 수의 차는 " + ((x>y) ? "x가 크다" : ((y>x) ? "y가 크다" : "같다")));
		
	}

}
