package day13;

public class SingleTon1 {
  //1.�ڽ�Ÿ���� static �ʵ� ����
	private static SingleTon1 instance = new SingleTon1();//�δ��� �� �� �ٷ� ��������Ƿ� ����Ȱ���� ������ �ӵ��� ����
  //2.�����ڸ� �ܺο��� ���� ���ϵ��� private�� ó��
	private SingleTon1() {}
  //3.public�޼ҵ�� �����ϵ��� �޼ҵ� ����
	public static SingleTon1 getInstance() {
		return instance;
	}
	
}
