package day18;

public class NumberFormatException1 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("10");
			System.out.println(a);
			a = Integer.parseInt("십");
			System.out.println(a);
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		}
	}
}
