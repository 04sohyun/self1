package day16;

public interface Interface14 {
 int BORROWED = 1; int NORMAL = 0;
 void checkOut(String name, String date);
 void checkIn();
}
class SeperateVolume implements Interface14{
	String requestNo; String title; String writer;
	int state; String name = "", date = "";
	
	public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}
	
	@Override
	public void checkOut(String name, String date) {
		if(state == BORROWED) {System.out.println(title+"은 대여중입니다."); return;}
		this.name = name;
		this.date = date;
		state = BORROWED;
		System.out.println(title+"을 "+name+"가 대출했습니다.");
		System.out.println("대출일자: "+date);
	}
	@Override
	public void checkIn() {
		name = "";
		date = "";
		state = NORMAL;
		System.out.println(title+"을 반납했습니다.");
	}
	
}
