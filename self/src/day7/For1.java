package day7;

public class For1 {
	public static void main(String[] args) {
		//������ ���ι���
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//������ ���ι���
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
		
	}

}
