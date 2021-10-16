package day18;

public class MultiCatchException3 {
	public static void main(String[] args) {
		String[] arr = {"hello","hi","bye"};
		String str = null;
		try {
		System.out.println(arr[3]);
		int a = Integer.parseInt("십");
		System.out.println(str.toString());//null 예외
		}catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("인덱스 예외");
		  }catch(NumberFormatException e) {
			  System.out.println("숫자형 예외");
		  }catch(Exception e) {//상위 레벨 예외가 아래에 와야됨
			  System.out.println("다른 예외");
		  }
	}
}
