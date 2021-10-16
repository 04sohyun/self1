package day18;

public class Throws4 {
	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 존재");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
