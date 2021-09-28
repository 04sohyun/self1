package day7;

public class Continue1 {
	public static void main(String[] args) {
		//짝수입력하기
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		//홀수입력하기
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
