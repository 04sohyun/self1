package day15;

public abstract class Abstract1 {
	abstract void run(); //�����X
	void method() {}  //�����O
	
	public static void main(String[] args) {
		//��ü�� ������ �� ���� Ŭ���� - abstractŬ����
		//Abstract1 a = new Abstract1();
		Fish f = new Fish();
		Bird b = new Bird();
		Insect i = new Insect();
		f.run();
		i.run();
		b.run();
	}
}
class Fish extends Abstract1{
	void run() {//������ �ʼ�
		System.out.println("���Ĩ�ϴ�.");
	}
}
class Bird extends Abstract1{
	void run() {
		System.out.println("���ư��ϴ�.");
	}
}
class Insect extends Abstract1{
	void run() {
		System.out.println("���ϴ�.");
	}
}