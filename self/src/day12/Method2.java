package day12;

public class Method2 {
	public static void main(String[] args) {
		Test t = new Test();
		t.min = 20; t.max=30;
		t.sum();
		System.out.println("�հ�:"+t.sum);
	}
}

class Test{
	//�ʵ�
	int min, max, sum;
	//�޼ҵ�- �Ű�����x, ����Ÿ��x
	void sum() {
		sum = min + max;
	}
	
}