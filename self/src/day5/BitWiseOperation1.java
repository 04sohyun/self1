package day5;

public class BitWiseOperation1 {
	public static void main(String[] args) {
		byte flag = 0b00001010; 
		 
		 if((flag & 0b00001000) == 0) //0b00001010�� 0b00001000 �� => 0b00001000�̹Ƿ� 0�� �ƴ�
			 System.out.println("�µ��� 0�� ����");
		 else
			 System.out.println("�µ��� 0�� �̻�");
	}

}
