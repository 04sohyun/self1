package day17;

public class NestedClass2 {
	void method(int arg) {
		int localVariable;
		localVariable = 1;
		System.out.println(arg);
		
		//����Ŭ����
		//����Ŭ�������� ���Ǵ� ������ ������ final�ʵ��� ��
		class Innter{
			public void method() {
			int result = arg + localVariable;
			}
		}
	}
}
