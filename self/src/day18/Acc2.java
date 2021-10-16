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
	//�Ա�
	public void deposit(int amount) {
		balance += amount;
	}
	//���
	public void withdraw(int amount) throws Exception {
		if(balance-amount<0)
			throw new Exception("�ܰ���� ����");
		balance -= amount;
		
	}
}
