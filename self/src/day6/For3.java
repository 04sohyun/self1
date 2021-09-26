package day6;

public class For3 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=10;i+=3) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=100;i*=2) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=10;i>0;i--) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		for(int i=10; i>10; i--) {
			System.out.print(i+"\t");//false이므로 블럭 실행안함
		}
	}

}
