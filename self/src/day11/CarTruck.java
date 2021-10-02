package day11;

public class CarTruck extends Car{
	String name = "truck";

	@Override
	void run() {
		System.out.println(name+"가 달립니다.");
	}
	
}
