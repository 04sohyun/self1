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
		
		//상속관계가 아니므로 불가능
		//B b2 = e;
		//C c2 = d;
		
		//Downcasting : 처음에 B타입으로 생성 후 부모타입으로 promotion 후 다시 B타입으로 casting
		B b3 = (B) a1;
		
		//처음부터 부모타입 객체를 자식참조변수에 대입불가
		//B b4 = new Polymorphism1{};
		
		//runtime시 오류 발생
		Polymorphism1 a5 =  b3;
		c1 = (C)a5;
	}
}

class B extends Polymorphism1{}
class D extends B{}

class C extends Polymorphism1{}
class E extends C{}
