package day12;

public class Method16 {
	public static void main(String[] args) {
		B3 b = new B3(80,90,98);
		b.sum();
		System.out.println("��:"+b.sum);
		int average = b.average();
		System.out.println("���:"+average);
	}
}
class B3{
	//�ʵ�
	int kor, eng, math, sum;
	//������
	B3(int k, int e, int m){
		kor=k; eng=e; math=m;
	}
	//�޼ҵ�
	void sum() {
		sum = kor+eng+math;
	}
	int average() {
		return sum/3;
	}
}