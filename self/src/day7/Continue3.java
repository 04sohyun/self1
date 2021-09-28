package day7;

public class Continue3 {
	public static void main(String[] args) {
	Label:	for(int i=0;i<=9;i++) {
		System.out.println();
			System.out.print("i="+i+"\t");
			for(int j=0;j<=9;j++) {
				System.out.print("j="+j);
				if(j>2) continue Label;
				System.out.print("Ãâ·ÂµÊ\t");
			}
			System.out.println();
		}
	}

}
