package day16;

public class Interface8Main2 {
	Interface8[] tires = {new HankookTire(),new HankookTire(),new KumhoTire(),new KumhoTire()};
	
	void run() {
		for(int i=0;i<tires.length;i++) {
			tires[i].roll();
		}
	}
	
	public static void main(String[] args) {
		Interface8Main2 car = new Interface8Main2();
		car.run();
		
		
	}
}
