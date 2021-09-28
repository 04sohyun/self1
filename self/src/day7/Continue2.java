package day7;

public class Continue2 {
	public static void main(String[] args) {
		for(int i=0;i<=9;i++) {
			System.out.print("i="+i+"\t");
			for(int j=0;j<=9;j++) {
				System.out.print("j="+j);
				if(j>2) continue;
				System.out.print(출력됨\t");
			}
			System.out.println();
		}
	}

}
