package day3;

public class Escape {

	public static void main(String[] args) {
		//escape���� : ���� ���ڷ� ǥ�õ��� �ʰ� \�� �����ؼ� Ư�� ����� �ϴ� ���ڵ�
		String message = "\"�ȳ��ϼ���\" \n ���� \t \"04sohyun\"�Դϴ�. \n c:\\temp";
		
		System.out.println(message);
		
		
		//���� '\'������ ���ڴ� Ư���뵵�� ���ڷ� ��ȯ
		//System.out.println("\");
		/* \������ u�� �����ڵ��� �ǹ̸� ǥ���ϴ� ������� ���� */
				
		System.out.println("\u0041");
		System.out.println("u");
				

	}

}
