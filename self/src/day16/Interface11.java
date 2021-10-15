package day16;

public interface Interface11 {
	void method();
}
abstract class A11 implements Interface11{
	//추상메소드로 재정의
	public abstract void method();
}
//추상클래스를 상속받은 실체클래스
class B11 extends A11{
	@Override
	public void method() {}
}