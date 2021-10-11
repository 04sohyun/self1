package day15;

public class Polymorphism1 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//Promotion
		Polymorphism1 a1 = b;
		Polymorphism1 a2 = c;
		Polymorphism1 a3 = d;
		Polymorphism1 a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//��Ӱ��谡 �ƴϹǷ� �Ұ���
		//B b2 = e;
		//C c2 = d;
		
		//Downcasting : ó���� BŸ������ ���� �� �θ�Ÿ������ promotion �� �ٽ� BŸ������ casting
		B b3 = (B) a1;
		
		//ó������ �θ�Ÿ�� ��ü�� �ڽ����������� ���ԺҰ�
		//B b4 = new Polymorphism1{};
		
		//runtime�� ���� �߻�
		Polymorphism1 a5 =  b3;
		c1 = (C)a5;
	}
}

class B extends Polymorphism1{}
class D extends B{}

class C extends Polymorphism1{}
class E extends C{}
