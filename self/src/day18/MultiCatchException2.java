package day18;

public class MultiCatchException2 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		try {
		System.out.println(arr[3]);
		int a = Integer.parseInt("��");
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�ε����� ������ ����");
		}
	}
}
