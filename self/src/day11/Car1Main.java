package day11;

public class Car1Main {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		
		System.out.println("model:"+car1.model);
		System.out.println("maxSpeed:"+car1.maxSpeed);

		System.out.println("현재속도:"+car1.currentSpeed);
		System.out.println("시동여부:"+car1.engineStart);
		System.out.println("Tire:"+car1.tire);
		
	}

}
