package day13;

public class SingleTon3 {
	public static void main(String[] args) {
		Bank b1 = Bank.getBank();
		Bank b2 = Bank.getBank();
		System.out.println("거래은행: "+b1.name);
		System.out.println("거래은행: "+b2.name);
	}
}
class Bank{
	String name;
	
  //1.자신타입으로 private필드 선언
	private static Bank b = new Bank("하난은행");
  //2.private으로 생성자 처리k
	private Bank(String n) {
		name=n;
	}
  //3.외부에서 접근가능한 메소드 생성
	static Bank getBank() {
		return b;
	}
}