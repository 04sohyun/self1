package day6;

public class For1 {
	public static void main(String[] args) {
		//반복문 내에서 변수 선언
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		//반복문 바깥 블럭에서 변수 선언
		int i1 = 1;
		for(;i1<=10;) {
			System.out.println(i1);
			i1++;
		}
	}

}
