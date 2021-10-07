package day12;

public class Method16 {
	public static void main(String[] args) {
		B3 b = new B3(80,90,98);
		b.sum();
		System.out.println("합:"+b.sum);
		int average = b.average();
		System.out.println("평균:"+average);
	}
}
class B3{
	//필드
	int kor, eng, math, sum;
	//생성자
	B3(int k, int e, int m){
		kor=k; eng=e; math=m;
	}
	//메소드
	void sum() {
		sum = kor+eng+math;
	}
	int average() {
		return sum/3;
	}
}