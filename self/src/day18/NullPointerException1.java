package day18;

public class NullPointerException1 {
	public static void main(String[] args) {
		String str = null;
		try {
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			//발생한 예외의 내용출력 toString();
			System.out.println(e.toString());
			//디버깅용 예외 메시지 출력
			e.printStackTrace();
		}
	}

}
