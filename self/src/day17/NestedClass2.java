package day17;

public class NestedClass2 {
	void method(int arg) {
		int localVariable;
		localVariable = 1;
		System.out.println(arg);
		
		//로컬클래스
		//로컬클래스에서 사용되는 변수는 무조건 final필드일 것
		class Innter{
			public void method() {
			int result = arg + localVariable;
			}
		}
	}
}
