package day13;

public class StaticVsNonstatic2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.printCarNo();
		Car2 c2 = new Car2();
		c2.printCarNo();
		Car2 c3 = new Car2();
		c3.printCarNo();
		
		System.out.println(Car2.seq);//클래스명.메소드()
	}
}
class Car2{
	static int seq;
	int no;
	
	Car2(){
		no = ++seq;
	}
	void printCarNo() {
		System.out.println(no);
	}
}