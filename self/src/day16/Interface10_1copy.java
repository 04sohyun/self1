package day16;

public class Interface10_1copy {}

class Bus1 implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
	//추가된 메소드
	void checkFare() {
		System.out.println("승차요금 체크");
	}
}
class Taxi1 implements Vehicle{
	@Override
	public void run() {
		System.out.println("Taxi가 달립니다.");
	}
}