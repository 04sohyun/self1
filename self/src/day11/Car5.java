package day11;

public class Car5 {
	//�ʵ�
		String model;
		String color;
		int maxSpeed;
		
		//������
		Car5(){
			System.out.println("default�����ڰ� ���� ���� �������?");
		}
		Car5(String model){
			this();//default������ ȣ��
			this.model=model;
			System.out.println("�� ���� �������?");
		}
		Car5(String model, String color){
			this(model);
			this.color=color;
			System.out.println("�Ű����� �ΰ�¥�� �������?");
		}
		Car5(String model, String color, int maxSpeed){
			this(model,color);
			this.maxSpeed=maxSpeed;
			System.out.println("�Ű����� ����¥�� �������?");
		}
}
