package day11;

public class Bank {

private int balance =0;

public void deposit(int amount) {
	balance += amount;
}

public void withdraw(int amount) {
	if(balance - amount >=0)
	balance -= amount;
}

public void currentBalance() {
	System.out.println("¿‹∞Ì:"+balance);
}
}
