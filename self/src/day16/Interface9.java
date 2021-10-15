package day16;

public interface Interface9 extends Interface9_1, Interface9_2 {
	void methodC();
}
class C9 implements Interface9{
	@Override
	public void methodA() {}
	@Override
	public void methodB() {}
	@Override
	public void methodC() {}
}