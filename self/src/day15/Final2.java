package day15;

public class Final2 {
 void method1() {}
 final void method2() {System.out.println("hello");
}
}
class A6 extends Final2{
	void method1() {System.out.println("재정의");
	
	//final 메소드는 호출불가
	//void method2() {}
	}
}