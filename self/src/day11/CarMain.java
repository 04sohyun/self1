package day11;

public class CarMain {
	public static void main(String[] args) {
		//°´Ã¼»ý¼º
		Car car = new Car();
		System.out.println(car.name);
		car.run();
		
		CarBus bus = new CarBus();
		System.out.println(bus.name);
		bus.run();
		CarTruck truck = new CarTruck();
		System.out.println(truck.name);
		truck.run();
	}

}
