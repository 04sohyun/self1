package day18;

public class Throw1 {
	void method() {
		try {
			System.out.println("A�� �޼ҵ�");
			//���ܰ�ü�� ���� ����
			throw new Exception();
		}catch(Exception e) {
			System.out.println("A�� ���ܹ߻�");
		}
	}
}
