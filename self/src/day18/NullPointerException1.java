package day18;

public class NullPointerException1 {
	public static void main(String[] args) {
		String str = null;
		try {
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			//�߻��� ������ ������� toString();
			System.out.println(e.toString());
			//������ ���� �޽��� ���
			e.printStackTrace();
		}
	}

}
