package day9;

public class StringArray2 {
	public static void main(String[] args) {
		String[] snake = {"������","�ȷ���","ĥ����","������","������"};
		String[] insect = {"�޶ѱ�","����","������"};
	
		//�� �迭 ��ġ��
		String[] animal = new String[snake.length+insect.length];
		
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
