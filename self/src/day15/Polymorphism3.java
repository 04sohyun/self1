package day15;

public class Polymorphism3 {
	public Polymorphism3 next;
	protected String name;
	
	public Polymorphism3() {next = null;}
	
	public void draw() {System.out.println("Shape");}
	public void paint() {draw();}
}
class Line extends Polymorphism3{
	public void draw() {System.out.println("Line");}
}
class Rect extends Polymorphism3{
	public void draw() {System.out.println("Rect");}
}
class Circle extends Polymorphism3{
	public void draw() {System.out.println("Circle");}
}