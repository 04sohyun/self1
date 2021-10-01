package day10;

public class StringArray2_1 {
	public static void main(String[] args) {
		String[][] snake = {{"구렁이","팔렁이","칠렁이"},{"구렁삼","구렁사","구렁오"}};
		
		for(int i=0;i<snake.length;i++) {
			for(int j=0;j<snake[i].length;j++) {
				System.out.print(snake[i][j]);
				if(j!=snake[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}

}
