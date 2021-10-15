package day16;

public class Interface14Main {
	public static void main(String[] args) {
		SeperateVolume sv1 = new SeperateVolume("1111", "대지", "펄벅");
		SeperateVolume sv2 = new SeperateVolume("2222", "java", "홍길동");
	
		//대여
		printState(sv1);
		sv1.checkOut("수지", "2021/10/15");
		printState(sv1);
		//반납
		sv1.checkIn();
	
		//대여
		printState(sv2);
		sv2.checkOut("꺽정", "2021/08/15");
		printState(sv2);
		//반납
		sv2.checkIn();
	}
	static void printState(SeperateVolume sv) {
		if(sv.state==sv.BORROWED) {
			System.out.println("====대출중인 책====");
			System.out.println("대출자: "+sv.name);
			System.out.println("대출일: "+sv.date);
		}else {
			System.out.println("====대출가능 책====");
		}
	}
}
