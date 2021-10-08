package day13;

import java.util.Scanner;

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("환율(1달라)>> ");
		double rate = scanner.nextDouble();
		Currentconverter.setRate(rate);
		System.out.println("백만원은 $"+Currentconverter.toDollar(1000000));
		System.out.println("$100는 "+Currentconverter.toWon(100));
		
	}
}
class Currentconverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toWon(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}