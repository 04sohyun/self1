package day4;

public class Operator5 {

	public static void main(String[] args) {
		int x = -1;
		
		if((5/x++)==5) {	//현재 x의 값은 -1이므로 false
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println(x);	//증감된 후의 x의 값이므로 0

	}

}
