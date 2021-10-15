package day16;

public class Interface10Main {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Driver1 driver1 = new Driver1();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개변수의 다형성
		driver.drive(taxi);
		driver.drive(bus);
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver1.drive(new Bus1());
		driver1.drive(new Taxi());
	}
}
