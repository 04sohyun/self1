package day14;

public class Extends1 {
	int field1;
	void method1() {}
}

class A{}
class B{}

//�θ�Ŭ���� �����Ұ�
//class C extends A,B{}

class C extends Extends1{
	String field2;
	void method2() {
		field1=10;
		method1();
	}
}