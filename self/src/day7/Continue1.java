package day7;

public class Continue1 {
	public static void main(String[] args) {
		//¦���Է��ϱ�
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		//Ȧ���Է��ϱ�
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
