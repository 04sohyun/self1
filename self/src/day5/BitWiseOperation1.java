package day5;

public class BitWiseOperation1 {
	public static void main(String[] args) {
		byte flag = 0b00001010; 
		 
		 if((flag & 0b00001000) == 0) //0b00001010과 0b00001000 비교 => 0b00001000이므로 0이 아님
			 System.out.println("온도는 0도 이하");
		 else
			 System.out.println("온도는 0도 이상");
	}

}
