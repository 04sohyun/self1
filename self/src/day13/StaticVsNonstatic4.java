package day13;

public class StaticVsNonstatic4 {
	public static void main(String[] args) {
		//non-static멤버는 객체를 생성 후 접근 가능
		//non-static멤버는 객체마다 개별적으로 생성
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