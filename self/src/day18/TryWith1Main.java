package day18;

public class TryWith1Main {
	public static void main(String[] args) {
		try(TryWith1 t1 = new TryWith1("excel")) {
			t1.read();
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외발생");
		}
	}
}