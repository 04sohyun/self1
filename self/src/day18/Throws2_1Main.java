package day18;

public class Throws2_1Main {
	public static void main(String[] args) {
		Throws2_1 t = new Throws2_1();
		try {
			t.method();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}
}
