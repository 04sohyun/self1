package day16;

public interface Interface8 {
	public void roll();
}
class HankookTire implements Interface8{
	@Override
	public void roll() {
		System.out.println("�ѱ�Ÿ�̾ �������ϴ�.");
	}
}
class KumhoTire implements Interface8{
	@Override
	public void roll() {
		System.out.println("��ȣŸ�̾ �������ϴ�.");
	}
}