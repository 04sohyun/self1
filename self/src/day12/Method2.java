package day12;

public class Method2 {
	public static void main(String[] args) {
		Test t = new Test();
		t.min = 20; t.max=30;
		t.sum();
		System.out.println("합계:"+t.sum);
	}
}

class Test{
	//필드
	int min, max, sum;
	//메소드- 매개변수x, 리턴타입x
	void sum() {
		sum = min + max;
	}
	
}