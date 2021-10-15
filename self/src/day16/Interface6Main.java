package day16;

public class Interface6Main implements Interface6{
	@Override
	public void method1() {}
	@Override
	public void method2() {}
}
class C implements Interface6{
	@Override
	public void method1() {}
	public void method4() {}
}
class D implements Interface6{
	@Override
	public void method1() {}
}