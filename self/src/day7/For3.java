package day7;

public class For3 {
	public static void main(String[] args) {
		//초기화부분이나 증감부분은 ,로 나열할 수 있다.
		for(int i=1, y=1;i<10;i++, System.out.println(y)) {
			System.out.println("hello");
			if(i==10) break;
			y++;
		}
	}

}
