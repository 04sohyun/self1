package day13;

public class SingleTon1Main {
	public static void main(String[] args) {
		//multiton��� - new ������();
		//SingleTon1 s1 = new SingleTon1(); - ������ privateó���ż� ���� ����
		//SingleTon1 s1 = SingleTon1.instance; - Ŭ������.�ʵ�->�ڽ�Ÿ�Ե� private�� ó���ؼ� ���ٸ���
		
		//Ŭ������.�޼ҵ�()ȣ��
		SingleTon1 s1 = SingleTon1.getInstance();
		SingleTon1 s2 = SingleTon1.getInstance();
		
		System.out.println(s1==s2?"������ü":"�ٸ���ü");
	}

}
