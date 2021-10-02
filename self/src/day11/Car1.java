package day11;

public class Car1 {
 //고유속성
 String company = "현대자동차";
 String model = "그랜저";
 int maxSpeed = 300;
 int productionYear;

 //현재상태
 int currentSpeed;
 boolean engineStart;
 
 //부품
 Car1Engine engine;
 Car1Handle handle;
 Car1Tire tire;
}
