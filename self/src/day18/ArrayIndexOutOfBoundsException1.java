package day18;

public class ArrayIndexOutOfBoundsException1 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		try {
			System.out.println(arr[0]);
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index������ ��� ����");
			System.out.println(e.getMessage());//3
			e.printStackTrace();
		}
	}
}
