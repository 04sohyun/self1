package day18;

public class TryWith1 implements AutoCloseable {
	private String file;
	//������
	public TryWith1(String file) {
		this.file = file;
	}
	//�޼ҵ�
	public void read() {
		System.out.println(file+"�� �н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file+"�� �ݽ��ϴ�.");
	}
}
