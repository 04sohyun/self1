package day9;

public class StringArray1 {
	public static void main(String[] args) {
		String[] snake = {"������","�ȷ���","ĥ����","������","������"};
		
		for(int i=0;i<snake.length;i++) {
			System.out.print(snake[i]+" ");
		}
		System.out.println();
		
		for(int i=snake.length-1;i>=0;i--) {
			System.out.print(snake[i]+" ");
		}
		System.out.println();

		
		//���� for���� �̿��Ͽ� ���
		for(String s:snake) {
			System.out.print(s+" ");
		}
	}

}
