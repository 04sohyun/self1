package day7;

public class DoWhile5 {
	public static void main(String[] args) {
		int i=2, j=1;
		do {
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);
			j=1;
			i++;
			System.out.println();
		}while(i<=9);
	}

}
