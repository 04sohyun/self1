package day16;

public interface Interface6 {
	void method1();
	
	//default메소드 - 실체가 있는 메소드로 구현시 재정의 필요x
	default void method2() {}
	default void method3() {}
	default void method4() {}
	
}
