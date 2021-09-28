package day7;

public class DoWhile1 {
	public static void main(String[] args) {
		char c = 'a'; //ASCII=97
		
		do {
			System.out.print(c);
			c =(char)(c+1);
		}while(c<='z');
	}

}
