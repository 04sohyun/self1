package day12;

public class Method5 {
	//필드
	int kor;
	int eng;
	int math;
	
	//메소드 - 매개변수X, 리턴타입O
	void display() {
		int sum = kor+eng+math;
		System.out.println("합계:"+sum);
		System.out.println("평군:"+sum/3);
	}
	
	//메소드 - 매개변수X, 리턴타입O
	void print() {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//메소드 - 매개변수O, 리턴타입X
	void print(int kor, int eng, int math) {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//메소드 - 매개변수O, 리턴타입O
	int res(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	//메소드 - 매개변수X, 리턴타입O
	int res() {
		return kor+eng+math;
	}
}
