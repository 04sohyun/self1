package day7;

public class Break5 {
	public static void main(String[] args) {
	A:	for(char upper='A';upper<='Z';upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') break A;
			}
		}
		System.out.println("실행종료");
	}

}
