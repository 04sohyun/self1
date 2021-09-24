package day3;

public class Literal5 {

	public static void main(String[] args) {
		//boolean타입의 논리 리터럴
		boolean a = true;
		boolean b = 10 > 0;
		
		//boolean c = 1; 대입 연산자 =을 기준으로 왼쪽은 boolean 오른쪽은 int 형변환 불가

		
		//boolean타입의 리터럴은 반복몬의 종료 조건에 사용됨
				int i = 1;
				while(a) {
					System.out.println(i);
					System.out.println("hello");
					i++; 	//i = i + 1;
					if(i==10) a=false;
				}
				System.out.println("종료");
				
				//현재 a값이 false이므로 아래 블럭은 실행 안함
				if(a) {
					System.out.println("hello");
				}
	}

}
