package day11;

public class Car6 {
	//�ʵ�
		String model;
		String color;
		int maxSpeed;
		
		//������
		Car6(){
			this("�׷���","���");
		}
		Car6(String model){
			this.model=model;
			System.out.println("�� ���� �������?");
		}
		Car6(String model, String color){
			this(model);
			this.color=color;
			System.out.println("�Ű����� �ΰ�¥�� �������?");
		}
		Car6(String model, String color, int maxSpeed){
			this(model,color);
			this.maxSpeed=maxSpeed;
			System.out.println("�Ű����� ����¥�� �������?");
		}
}
