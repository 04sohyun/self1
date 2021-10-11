package day15;

public class Polymorphism3Main2 {
	static void paint(Polymorphism3 p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Polymorphism3());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
