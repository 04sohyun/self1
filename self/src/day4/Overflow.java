package day4;

public class Overflow {

	public static void main(String[] args) {
		//Overflow ����(byte)
		
		for(int i = -128;i<129;i++) {
			System.out.println(i+":"+(byte)i);
		}

	}

}
