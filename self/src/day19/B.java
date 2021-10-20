package day19;

import java.util.Arrays;

public class B implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	public B(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//æË¿∫∫π¡¶
		B b = (B)super.clone();
		//πËø≠ ±Ì¿∫∫π¡¶
		//int[] arr = new int[this.scores.length];
		b.scores = Arrays.copyOf(this.scores, this.scores.length);
	
		//Car ±Ì¿∫∫π¡¶
		b.car=new Car(this.car.model);
		
		b.name = new String(this.name);
		return b;
	}
	
	public B getB() {
		B cloned = null;
		try {
			cloned = (B)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
	
}
class Car{
	String model;

	public Car(String model) {
		this.model = model;
	}
}