package day12;

public class Method4 {
	public static void main(String[] args) {
		Car c = new Car();
		c.setCc(1000);
		c.setColor("red");
		c.setKind("sonata");
	}
}

class Car{
	//�ʵ�
	String kind;
	int cc;
	String color;

	//�޼ҵ� - �Ű�����O, ����Ÿ��X
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}