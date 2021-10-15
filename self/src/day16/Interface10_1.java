package day16;

public class Interface10_1 {}

class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
}
class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("Taxi가 달립니다.");
	}
}