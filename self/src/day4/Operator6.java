package day4;

public class Operator6 {

	public static void main(String[] args) {
		int age = 25;
		
		if((age>=20) && (age<=30)) {
			System.out.println("20대");
		}
		
		char c = 'X';		//ASCII코드값으로 비교
		if((c>='A') && (c<='Z')) {
			System.out.println("영문대문자");
		}
		
		int x = 50; int y = 23;
		if((x>=0) && (x<=50) && (y>=0) && (y<=50)) {
			System.out.println("영역 내의 좌표");
		}
		
	}

}
