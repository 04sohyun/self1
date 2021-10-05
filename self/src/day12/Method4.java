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
	//필드
	String kind;
	int cc;
	String color;

	//메소드 - 매개변수O, 리턴타입X
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