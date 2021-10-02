package day11;

public class Car2Main {
	public static void main(String[] args) {
	//기본생성자 없으므로 호출불가
	//Car2 car = new Car2();
		
	Car2 car = new Car2("소나타","흰색",200);
	System.out.println(car.model);
	System.out.println(car.color);
	System.out.println(car.maxSpeed);

	}
}
