package day17;

public class NestedClass3Main {
	public static void main(String[] args) {
		NestedClass3.B b = new NestedClass3.B();
		b.field1 = 3;
		b.method1();
		
		b.field2 = 5;
		b.method2();
	}
}
