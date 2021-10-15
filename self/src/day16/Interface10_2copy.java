package day16;

public class Interface10_2copy {}
class Driver1{
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus1) {
			Bus1 bus1 = (Bus1) vehicle;
			bus1.checkFare();
		}
		vehicle.run();
	}
}