package day3;

public class Literal5 {

	public static void main(String[] args) {
		//booleanŸ���� �� ���ͷ�
		boolean a = true;
		boolean b = 10 > 0;
		
		//boolean c = 1; ���� ������ =�� �������� ������ boolean �������� int ����ȯ �Ұ�

		
		//booleanŸ���� ���ͷ��� �ݺ����� ���� ���ǿ� ����
				int i = 1;
				while(a) {
					System.out.println(i);
					System.out.println("hello");
					i++; 	//i = i + 1;
					if(i==10) a=false;
				}
				System.out.println("����");
				
				//���� a���� false�̹Ƿ� �Ʒ� ���� ���� ����
				if(a) {
					System.out.println("hello");
				}
	}

}
