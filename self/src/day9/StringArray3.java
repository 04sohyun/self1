package day9;

public class StringArray3 {
	public static void main(String[] args) {
		String[] snake = {"������","�ȷ���","ĥ����","������","������"};
		String[] insect = {"�޶ѱ�","����","������"};
	
		//�� �迭 �պ��� ū �迭�� ����
		//����Ÿ���� �⺻���� null�� ����
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
