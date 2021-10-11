package day15;

public class Drive {
	void drive(Vehicle v) {
		v.run();
	}
	void drive(Vehicle[] vs) {
		for(Vehicle v:vs) {
			v.run();
		}
	}
	
	public static void main(String[] args) {
		Drive drv = new Drive();
		
		Vehicle v1 = new Vehicle();
		drv.drive(v1);
		
		Bus bus = new Bus();
		drv.drive(bus);
		
		Truck truck = new Truck();
		drv.drive(truck);
		
		Vehicle[] vehicle = {v1,bus,truck,bus};
		drv.drive(vehicle);
	}

}
