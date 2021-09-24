package day4;

public class Operator2 {

	public static void main(String[] args) {
		//증감 연산자
		
		int x = 10;
		int y = 10;
		int z;
		
		z=x++;
		System.out.println(z);	//10
		System.out.println(x);	//11
		
		z=++x;
		System.out.println(z);	//12
		System.out.println(x);	//12
		
		z=y--;
		System.out.println(z);	//10
		System.out.println(y);	//9
		
		z=--y;
		System.out.println(z);	//8
		System.out.println(y);	//8
		
	}

}
