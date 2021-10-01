package day9;

public class StringArray3 {
	public static void main(String[] args) {
		String[] snake = {"구렁이","팔렁이","칠렁이","육렁이","오렁이"};
		String[] insect = {"메뚜기","개미","지렁이"};
	
		//두 배열 합보다 큰 배열에 복사
		//참조타입의 기본값인 null이 나옴
		String[] animal = new String[snake.length+insect.length+1];
		
		for(int i=0;i<snake.length;i++) {
			animal[i]=snake[i];
		}
		for(int i=0;i<insect.length;i++) {
			animal[snake.length+i]=insect[i];
		}
		
		for(String s:animal) {
			System.out.print(s+" ");
		}
	}

}
