package day11;

public class Korean1Main {
	public static void main(String[] args) {
		Korean1 korean = new Korean1("홍길동","011225-1234567");
		System.out.println(korean.name);
		System.out.println(korean.sno);
		
		Korean1 person = new Korean1("일지매","930525-0123456");
		System.out.println(person.name);
		System.out.println(person.sno);
	}

}
