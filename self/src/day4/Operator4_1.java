package day4;

public class Operator4_1 {

	public static void main(String[] args) {
		int time = 5000;
		
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		
		System.out.println(time+"�ʴ�");
		System.out.println(hour+"�ð�");
		System.out.println(minute+"��");
		System.out.println(second+"���Դϴ�.");

	}

}
