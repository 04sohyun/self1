package day7;

public class Break3 {
	public static void main(String[] args) {
	A:	for(int i=0;i<=9;i++) {
			System.out.print("i="+i+"\t");
			for(int j=0;j<=9;j++) {
				System.out.print("j="+j+"\t");
				if(j>3) break A;
			}
			System.out.println();
		}
	}

}
