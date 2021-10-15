package day16;

public interface Interface2 {
	//상수
	int a = 10;
	//메소드
	void a();
}
class G2 implements Interface2{
	@Override
	public void a() {
		System.out.println("aa");
	}
}
class G3 implements Interface2{
	@Override
	public void a() {
		System.out.println("bb");
	}
}