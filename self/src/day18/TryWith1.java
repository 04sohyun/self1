package day18;

public class TryWith1 implements AutoCloseable {
	private String file;
	//생성자
	public TryWith1(String file) {
		this.file = file;
	}
	//메소드
	public void read() {
		System.out.println(file+"을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
	}
}
