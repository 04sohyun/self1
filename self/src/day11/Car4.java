package day11;

public class Car4 {
	//this()�޼ҵ� ȣ��
	
	//�ʵ�
	String model;
	String color;
	int maxSpeed;
	
	//������
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
