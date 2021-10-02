package day11;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10000);
		
		bank.withdraw(4000);
		
		bank.currentBalance();
	}

}
