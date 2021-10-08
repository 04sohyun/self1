package day13;

public class StaticVsNonstatic3 {
	//필드
	static int currentAmount = 100;
	int amount;
	
	//생성자
	StaticVsNonstatic3(int amount){
		this.amount=amount;
		currentAmount-=amount;
	}
}
