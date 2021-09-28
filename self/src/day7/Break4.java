package day7;

public class Break4 {
	public static void main(String[] args) {
		for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') break;
			}
		}
		System.out.println("실행종료");
	}

}
