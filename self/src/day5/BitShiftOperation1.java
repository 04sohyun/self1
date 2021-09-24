package day5;

public class BitShiftOperation1 {
	public static void main(String[] args) {
		/* << 왼쪽 shift 연산*/
		//byte, short, char는 연산시 int로 변환 후 연산에 참여함
		byte a = 5; // 00000101
		byte b = (byte)(a<<2); // 00010100
		System.out.println(b); //20
				
		/* >> 오른쪽 shift 연산*/
		//int타입의 값은 양수이면 최상위 비트가 0, 음수이면 최상위 비트가 1임
		a = 20; // 00010100
		b = (byte)(a>>2); // 00000101
		System.out.println(b); // 5
				
		
		byte c = (byte)0xf8; //  11111000
		byte d = (byte)(c>>2); // 11111110
		System.out.println(c); //-8
		System.out.println(d); //-2
				
		/* >>> 오른쪽 Shift 연산*/
		byte e = 20; // 00010100
		byte f = (byte)(e>>>2); // 00000101
		System.out.println(f); // 5
	}

}
