package day18;

public class ClassCastException1Main {
	public static void main(String[] args) {
		try {
			Animal animal = new Cat();
			Dog dog = (Dog) animal;
		}catch(ClassCastException e) {
			System.out.println("����̴� ���� �� �� �����ϴ�.");
		}finally {
			System.out.println("���α׷� ����");
		}
	}
}
