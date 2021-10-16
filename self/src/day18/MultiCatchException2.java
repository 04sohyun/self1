package day18;

public class MultiCatchException2 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		try {
		System.out.println(arr[3]);
		int a = Integer.parseInt("십");
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("인덱스나 숫자형 예외");
		}
	}
}
