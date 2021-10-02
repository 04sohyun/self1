package day11;

public class Car4 {
	//this()메소드 호출
	
	//필드
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car4(){}
	Car4(String model){
		this.model=model;
	}
	Car4(String model, String color){
		this(model);
		this.color=color;
	}
	Car4(String model, String color, int maxSpeed){
		this(model,color);
		this.maxSpeed=maxSpeed;
	}
}
