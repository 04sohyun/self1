package day16;

public interface Interface1 {
	//��� - ����� ���ÿ� �ʱ�ȭ
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10;
	
	//�޼ҵ� - �߻�޼ҵ�� ����θ� ����
	void method();
}
//��üŬ���� ����
class TVRemoteControl implements Interface1{

	//������ �ʼ�
	@Override
	public void method() {
		System.out.println("��ü Ŭ�����޼ҵ�");
	}
	
}