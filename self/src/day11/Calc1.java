package day11;

public class Calc1 {
	//�ܺο��� ���� ����
	public final String model = "00001";
	//�ܺο��� ���ٺҰ�
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
	//getCalc()�޼ҵ常 ȣ�Ⱑ��-�ܺο��� ȣ��Ұ�
	private int add(int x, int y) {return x+y;}
	private int sub(int x, int y) {return x-y;}
	private int mul(int x, int y) {return x*y;}
	private int div(int x, int y) {return x/y;}

}
