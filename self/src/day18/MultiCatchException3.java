package day18;

public class MultiCatchException3 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		String str = null;
		try {
		System.out.println(arr[3]);
		int a = Integer.parseInt("��");
		System.out.println(str.toString());//null ����
		}catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("�ε��� ����");
		  }catch(NumberFormatException e) {
			  System.out.println("������ ����");
		  }catch(Exception e) {//���� ���� ���ܰ� �Ʒ��� �;ߵ�
			  System.out.println("�ٸ� ����");
		  }
	}
}
