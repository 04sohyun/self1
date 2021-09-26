package day6;

public class For2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//식을 나열
		int sum1 = 0;
		
		for(int i1=1;i1<=10;i1++) {
			sum1 += i1;
			System.out.print(i1);
			
		if(i1<=9) {
			System.out.print("+");
		}else {
			System.out.print("=");
			System.out.print(sum1);
		}
		}
	
	}

}
