package day4;

public class Operator5 {

	public static void main(String[] args) {
		int x = -1;
		
		if((5/x++)==5) {	//���� x�� ���� -1�̹Ƿ� false
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println(x);	//������ ���� x�� ���̹Ƿ� 0

	}

}
