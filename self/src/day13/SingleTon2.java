package day13;

public class SingleTon2 {
  //1.�ڽ�Ÿ���� static �ʵ� ����
	private static SingleTon2 instance;
  //2.�����ڸ� �ܺο��� ���� ���ϵ��� private�� ó��
	private SingleTon2() {}
  //3.public�޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon2 getInstance() {//����� �� ��ü�� �����ϹǷ� ����Ȱ�뿡 ����.
		if(instance==null) instance = new SingleTon2();
		return instance;
	}
	
}
