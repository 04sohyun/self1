package day18;

public class AccMain2 {
	public static void main(String[] args) {
		Acc2 acc2 = new Acc2("111-001","ȫ�浿",10000);
		//�԰�
		acc2.deposit(10000);
		System.out.println(acc2.getBalance());
		//���
		try {
		acc2.withdraw(15000);
		System.out.println(acc2.getBalance());
		acc2.withdraw(15000);
		System.out.println(acc2.getBalance());
		}catch(Exception e) {System.out.println(e.getMessage());}
	}

}
