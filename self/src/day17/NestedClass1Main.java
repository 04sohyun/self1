package day17;

public class NestedClass1Main {
	public static void main(String[] args) {
		NestedClass1 a = new NestedClass1();
		NestedClass1.B b = a.new B();
		b.field1 = 3;
		b.method1();
	}
}
