package day15;

public abstract class Calculator {
  public abstract int add(int a, int b);
  public abstract int sub(int a, int b);
  public abstract int avg(int[] a);
}
class Calc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int avg(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	
}