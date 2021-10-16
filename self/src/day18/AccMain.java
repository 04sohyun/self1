package day18;

public class AccMain {
	public static void main(String[] args) {
		Acc acc = new Acc("111-001","홍길동",10000);
		//입고
		acc.deposit(10000);
		System.out.println(acc.getBalance());
		//출금
		acc.withdraw(15000);
		System.out.println(acc.getBalance());
		
		acc.withdraw(15000);
		System.out.println(acc.getBalance());
	}

}
