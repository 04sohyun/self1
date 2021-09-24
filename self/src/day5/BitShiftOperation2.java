package day5;

public class BitShiftOperation2 {
	public static void main(String[] args) {
		byte c = 20; //0001 0100 => 0x14
		byte d = -8; //0000 1000<8> => 1111 0111<보수> => 1111 1000<-8> => 0xf8
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);//01010000 => 80
		System.out.println(c>>2);//00000101 => 5
		System.out.println(d>>2);//11111110 => 11111101 => 00000010<2> //-2
		
		System.out.printf("%04x\n", d); //1111 1000 =>00f8
		
		System.out.printf("%x\n", (byte)(d>>>2)); //0011 1111 1111 1111 1111 1111 1111 1110(int) => 1111 1110(byte) => fe
		
		System.out.printf("%x\n", (int)d);//1111 1111 1111 1111 1111 1111 1111 1000 => fffffff8 
		System.out.printf("%x\n", (d>>>2));//0011 1111 1111 1111 1111 1111 1111 1110 => 3ffffffe
		
	}

}
