package day6;

public class Random1 {
	public static void main(String[] args) {
		double ran = Math.random();
		System.out.println(ran); //0.0<= ran <1
		
		int ran1 = (int)(Math.random()*10);
		System.out.println(ran1); //0<= ran1 < 10
		
		//난수를 이용하여 61~70사이의 무작위의 값 출력
		int ran2 = (int)(Math.random()*10);
		System.out.println(ran2+61);
		
	}

}
