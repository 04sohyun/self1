package day16;

public class Interface7Main {
	public static void main(String[] args) {
		//다형성
		Interface7 a1 = new B1();
		Interface7 a2 = new C1();
		Interface7 a3 = new D1();
		Interface7 a4 = new E1();
		
		Interface7[] arr = new Interface7[5];
		//arr[0] = new Interface7;
		arr[1] = new B1();
		arr[2] = new C1();
		arr[3] = new D1();
		arr[4] = new E1();
		
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[i] instanceof Interface7?"Interface7타입":"Interface7타입아님");
		}
	}
}
