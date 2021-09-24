package day5;

public class BitWiseOperation2 {
	public static void main(String[] args) {
		short a = (short)0x55ff; 
		//5      5     f     f
		//0101  0101  1111  1111
		short b = (short)0x00ff; 
		//0      0      f    f
		//0000  0000  1111  1111
		
		System.out.println(a);//5*16^3 + 5*16^2 + 15*16^1 + 15*16^0 => 22015
		System.out.println(b);//0*16^3 + 0*16^2 + 15*16^1 + 15*16^0 => 255
		
		//��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.println((short)(a&b));//0000 0000 1111 1111 => 255
		//printf()�� ��� ���� �޼ҵ�, print("%�������", ��);//���� ���� ���·� �������
		System.out.printf("%04x\n",(short)(a&b));//0000 0000 1111 1111 => 00ff
		System.out.printf("%04x\n",(short)(a|b));//0101 0101 1111 1111 => 55ff
		System.out.printf("%04x\n",(short)(a^b));//0101 0101 0000 0000 => 5500
		System.out.printf("%04x\n",(short)(~a));//1010 1010 0000 0000 => aa00

	}

}
