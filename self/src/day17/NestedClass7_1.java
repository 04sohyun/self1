package day17;

public class NestedClass7_1 {
	NestedClass7 n = new Child();
	void method() {
		n.parentMethod();
	}
	//�͸�ü ����
	NestedClass7 n2 = new NestedClass7() {
		int childF;
		void childM() {}
		@Override
		public void parentMethod() {
			childF=3;
			childM();
		}
	};
	void method2() {
		n2.parentMethod();
	}
}
