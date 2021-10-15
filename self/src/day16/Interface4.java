package day16;

public class Interface4 {
	public static void main(String[] args) {
		//형변환 - 실체클래스 객체를 생성하여 자손 인터페이스에 대입
		H4 h4 = new H5();
		//다형성
		h4.h1();
		h4.h2();
		h4.h3();
		h4.h4();
	}
}
//부모인터페이스
interface H1{void h1();}
//자식인터페이스
interface H2 extends H1{void h2();}
interface H3 extends H1{void h3();}
//자손인터페이스
interface H4 extends H2, H3{void h4();}

//실체클래스
class H5 implements H4{
	@Override
	public void h1() {System.out.println("h1메소드");}
	@Override
	public void h2() {System.out.println("h2메소드");}
	@Override
	public void h3() {System.out.println("h3메소드");}
	@Override
	public void h4() {System.out.println("h4메소드");}
}