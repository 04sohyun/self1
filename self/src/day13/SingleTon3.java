package day13;

public class SingleTon3 {
	public static void main(String[] args) {
		Bank b1 = Bank.getBank();
		Bank b2 = Bank.getBank();
		System.out.println("�ŷ�����: "+b1.name);
		System.out.println("�ŷ�����: "+b2.name);
	}
}
class Bank{
	String name;
	
  //1.�ڽ�Ÿ������ private�ʵ� ����
	private static Bank b = new Bank("�ϳ�����");
  //2.private���� ������ ó��k
	private Bank(String n) {
		name=n;
	}
  //3.�ܺο��� ���ٰ����� �޼ҵ� ����
	static Bank getBank() {
		return b;
	}
}