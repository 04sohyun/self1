package day16;

public class Interface8Main {
	Interface8 fLTire = new HankookTire();
	Interface8 fRTire = new HankookTire();
	Interface8 bLTire = new KumhoTire();
	Interface8 bRTire = new KumhoTire();
	
	void run() {
		fLTire.roll();
		fRTire.roll();
		bLTire.roll();
		bRTire.roll();
	}
	
	public static void main(String[] args) {
		Interface8Main car = new Interface8Main();
		car.run();
		
		
	}
}
