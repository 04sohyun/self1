package day4;

public class Operator3 {

	public static void main(String[] args) {
		//�� ���� ������
		
		boolean play = true;
		
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		int i =0;
		while(play) {
			i++;
			System.out.println("hello");
			if(i==5) play = !play;	//�ݺ��� ���������� ����
		}
		
		
	}

}
