package day9;

public class StringArray4 {
	public static void main(String[] args) {
		String[] snake = {"������","�ȷ���","ĥ����","������","������"};
		String[] insect = {"�޶ѱ�","����","������"};
	
		String[] animal = new String[snake.length+insect.length+1];
		
		for(int i=0;i<snake.length;i++) animal[i]=snake[i];
		for(int i=0;i<insect.length;i++) animal[snake.length+i]=insect[i];
		
		System.out.println(snake[0]==animal[0]?"���ϰ�ü����":"�ٸ���ü����");
		
		System.out.println(snake[0].hashCode());
		System.out.println(animal[0].hashCode());
		
		String str = snake[0];
		System.out.println(str.hashCode());
		
	}

}
