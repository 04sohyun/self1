package day13;

public class StaticVsNonstatic4 {
	public static void main(String[] args) {
		//non-static����� ��ü�� ���� �� ���� ����
		//non-static����� ��ü���� ���������� ����
		Car myCar = new Car();
		myCar.gas=10;
		myCar.setSpeed(80);
		myCar=null;
		
		Car yourCar = new Car();
		yourCar.gas=20;
		yourCar.setSpeed(100);
		yourCar=null;
	}
}
class Car{
	int gas;
	
	void setSpeed(int speed) {}
}