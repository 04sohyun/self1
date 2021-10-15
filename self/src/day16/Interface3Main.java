package day16;

public class Interface3Main {
	public static void main(String[] args) {
		Interface3 i3 = new Interface3_Audio();
		i3.turnOn();
		i3.setVolume(5);
		i3.turnOff();
	
		i3 = new Interface3_TV();
		i3.turnOn();
		i3.setVolume(5);
		i3.turnOff();
	}

}
