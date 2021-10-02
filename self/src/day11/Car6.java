package day11;

public class Car6 {
	//필드
		String model;
		String color;
		int maxSpeed;
		
		//생성자
		Car6(){
			this("그랜저","흰색");
		}
		Car6(String model){
			this.model=model;
			System.out.println("그 다음 실행되지?");
		}
		Car6(String model, String color){
			this(model);
			this.color=color;
			System.out.println("매개변수 두개짜리 실행되지?");
		}
		Car6(String model, String color, int maxSpeed){
			this(model,color);
			this.maxSpeed=maxSpeed;
			System.out.println("매개변수 세개짜리 실행되지?");
		}
}
