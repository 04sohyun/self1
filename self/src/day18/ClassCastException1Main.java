package day18;

public class ClassCastException1Main {
	public static void main(String[] args) {
		try {
			Animal animal = new Cat();
			Dog dog = (Dog) animal;
		}catch(ClassCastException e) {
			System.out.println("고양이는 개가 될 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
