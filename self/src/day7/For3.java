package day7;

public class For3 {
	public static void main(String[] args) {
		//�ʱ�ȭ�κ��̳� �����κ��� ,�� ������ �� �ִ�.
		for(int i=1, y=1;i<10;i++, System.out.println(y)) {
			System.out.println("hello");
			if(i==10) break;
			y++;
		}
	}

}
