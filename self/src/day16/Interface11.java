package day16;

public interface Interface11 {
	void method();
}
abstract class A11 implements Interface11{
	//�߻�޼ҵ�� ������
	public abstract void method();
}
//�߻�Ŭ������ ��ӹ��� ��üŬ����
class B11 extends A11{
	@Override
	public void method() {}
}