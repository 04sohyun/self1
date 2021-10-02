package day11;

public class Calc1 {
	//외부에서 수정 못함
	public final String model = "00001";
	//외부에서 접근불가
	private double result = 0;
	
	public void getCalc(String op, int x, int y) {
		switch(op) {
		case "+" : result=add(x,y);
					System.out.println(result); break;
		case "-" : result=sub(x,y);
					System.out.println(result); break;
		case "x" : result=mul(x,y);
					System.out.println(result); break;
		case "/" : result=div(x,y);
					System.out.println(result); break;
		}
	}
	//getCalc()메소드만 호출가능-외부에서 호출불가
	private int add(int x, int y) {return x+y;}
	private int sub(int x, int y) {return x-y;}
	private int mul(int x, int y) {return x*y;}
	private int div(int x, int y) {return x/y;}

}
