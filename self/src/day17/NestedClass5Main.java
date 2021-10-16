package day17;

public class NestedClass5Main {
	public static void main(String[] args) {
		NestedClass5 a = new NestedClass5();
		NestedClass5.B b = a.new B();
		b.print();
	}

}
