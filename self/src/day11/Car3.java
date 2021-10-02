package day11;

public class Car3 {

	//생성자 오버로딩
	Car3(){}
	Car3(String model){}
	Car3(String model, String color){}//String String
	//Car3(String color, String model){}//String String - 오버로딩아님
	Car3(String model, String color, int maxSpeed){}//String String int
	Car3(int maxSpeed, String model, String color){}//int String String
}
