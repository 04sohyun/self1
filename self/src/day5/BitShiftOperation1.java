package day5;

public class BitShiftOperation1 {
	public static void main(String[] args) {
		/* << ���� shift ����*/
		//byte, short, char�� ����� int�� ��ȯ �� ���꿡 ������
		byte a = 5; // 00000101
		byte b = (byte)(a<<2); // 00010100
		System.out.println(b); //20
				
		/* >> ������ shift ����*/
		//intŸ���� ���� ����̸� �ֻ��� ��Ʈ�� 0, �����̸� �ֻ��� ��Ʈ�� 1��
		a = 20; // 00010100
		b = (byte)(a>>2); // 00000101
		System.out.println(b); // 5
				
		
		byte c = (byte)0xf8; //  11111000
		byte d = (byte)(c>>2); // 11111110
		System.out.println(c); //-8
		System.out.println(d); //-2
				
		/* >>> ������ Shift ����*/
		byte e = 20; // 00010100
		byte f = (byte)(e>>>2); // 00000101
		System.out.println(f); // 5
	}

}
