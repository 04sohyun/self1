package day13;

public class StaticVsNonstatic3 {
	//�ʵ�
	static int currentAmount = 100;
	int amount;
	
	//������
	StaticVsNonstatic3(int amount){
		this.amount=amount;
		currentAmount-=amount;
	}
}
