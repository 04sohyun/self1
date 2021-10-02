package day11;

public class Calc1Main {
	public static void main(String[] args) {
		Calc1 calc = new Calc1();
		calc.getCalc("+", 5, 3);
		calc.getCalc("-", 5, 3);
		calc.getCalc("x", 6, 3);
		calc.getCalc("/", 5, 3);
		
		
		System.out.println(calc.model);
	}

}
