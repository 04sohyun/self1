package day7;

public class For2 {
	public static void main(String[] args) {
		
		for(int i=1;true;i++) {
			System.out.println(i);
			if(i==10) break;
		}
		//조건식이 빈칸이면 true로 간주한다.
		for(int i=1; ;i++) {
			System.out.println(i);
			if(i==10) break;
		}
		
	}

}
