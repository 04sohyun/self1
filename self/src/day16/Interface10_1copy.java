package day16;

public class Interface10_1copy {}

class Bus1 implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus�� �޸��ϴ�.");
	}
	//�߰��� �޼ҵ�
	void checkFare() {
		System.out.println("������� üũ");
	}
}
class Taxi1 implements Vehicle{
	@Override
	public void run() {
		System.out.println("Taxi�� �޸��ϴ�.");
	}
}