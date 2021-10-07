package day12;

public class MethodSampleMain {
	public static void main(String[] args) {
		MethodSample m = new MethodSample();
		
		System.out.println(m.getSum(10, 20));
		System.out.println(m.getSum(10.0, 20.0));
		System.out.println(m.getSum(10, 20, 30));
	}

}
