package day13;

public class SingleTon2Main {
	public static void main(String[] args) {
		//multiton��� - new ������();
		//SingleTon2 s1 = new SingleTon2(); - ������ privateó���ż� ���� ����
		//SingleTon2 s1 = SingleTon2.instance; - Ŭ������.�ʵ�->�ڽ�Ÿ�Ե� private�� ó���ؼ� ���ٸ���
		
		//Ŭ������.�޼ҵ�()ȣ��
		SingleTon2 s1 = SingleTon2.getInstance();
		SingleTon2 s2 = SingleTon2.getInstance();
		
		System.out.println(s1==s2?"������ü":"�ٸ���ü");
	}

}
