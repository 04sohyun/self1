package day16;

public class Interface9Main {
	public static void main(String[] args) {
		//C9 ->Interface9 ->Interface9_1�� Ÿ�Ժ�ȯ
		Interface9_1 ia = new C9();
		ia.methodA();
		//ia.methodC(); //interface9_1�� ���� �޼ҵ��̹Ƿ� �����߻�
		
		//C9 ->Interface9 ->Interface9_2�� Ÿ�Ժ�ȯ
		Interface9_2 ib = new C9();
		ib.methodB();
		//ib.methodC();
		
		Interface9 ic = new C9();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
