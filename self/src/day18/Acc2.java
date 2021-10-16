package day18;

public class Acc2 {
	private String ano;
	private String name;
	private int balance;
	public Acc2(String ano, String name, int balance) {
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//입금
	public void deposit(int amount) {
		balance += amount;
	}
	//출금
	public void withdraw(int amount) throws Exception {
		if(balance-amount<0)
			throw new Exception("잔고부족 예외");
		balance -= amount;
		
	}
}
