package day16;

public interface Interface8 {
	public void roll();
}
class HankookTire implements Interface8{
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
}
class KumhoTire implements Interface8{
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}