package day6;

public class Switch7 {
	public static void main(String[] args) {
		//월1 화2 수3 목4 금5 토6 일0
		int day = (int)(Math.random()*7);
		
		switch(day) {
		case 1 : case 2 : case 3 : case 4 :
		System.out.println("열심히 공부합니다."); break;
		case 5 :
			System.out.println("쇼핑을 합니다."); break;
		case 6 : case 0 :
			System.out.println("휴식을 취합니다."); break;
		}
	}

}
