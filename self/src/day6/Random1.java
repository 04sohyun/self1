package day6;

public class Random1 {
	public static void main(String[] args) {
		double ran = Math.random();
		System.out.println(ran); //0.0<= ran <1
		
		int ran1 = (int)(Math.random()*10);
		System.out.println(ran1); //0<= ran1 < 10
		
		//������ �̿��Ͽ� 61~70������ �������� �� ���
		int ran2 = (int)(Math.random()*10);
		System.out.println(ran2+61);
		
	}

}
