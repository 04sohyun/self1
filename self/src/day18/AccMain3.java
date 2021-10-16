package day18;

public class AccMain3 {
	public static void main(String[] args) throws Exception {
		Acc3 acc3 = new Acc3("111-001","홍길동",10000);
		//입고
		acc3.deposit(10000);
		System.out.println(acc3.getBalance());
		//출금
		acc3.withdraw(15000);
		System.out.println(acc3.getBalance());
		
		acc3.withdraw(15000);
		System.out.println(acc3.getBalance());
	}

}
