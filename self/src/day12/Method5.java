package day12;

public class Method5 {
	//�ʵ�
	int kor;
	int eng;
	int math;
	
	//�޼ҵ� - �Ű�����X, ����Ÿ��O
	void display() {
		int sum = kor+eng+math;
		System.out.println("�հ�:"+sum);
		System.out.println("��:"+sum/3);
	}
	
	//�޼ҵ� - �Ű�����X, ����Ÿ��O
	void print() {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//�޼ҵ� - �Ű�����O, ����Ÿ��X
	void print(int kor, int eng, int math) {
		System.out.println(kor+"\t"+eng+"\t"+math);
	}
	
	//�޼ҵ� - �Ű�����O, ����Ÿ��O
	int res(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	//�޼ҵ� - �Ű�����X, ����Ÿ��O
	int res() {
		return kor+eng+math;
	}
}
