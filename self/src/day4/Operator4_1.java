package day4;

public class Operator4_1 {

	public static void main(String[] args) {
		int time = 5000;
		
		int hour = (time/60)/60;
		int minute = (time/60)%60;
		int second = time%60;
		
		System.out.println(time+"초는");
		System.out.println(hour+"시간");
		System.out.println(minute+"분");
		System.out.println(second+"초입니다.");

	}

}
