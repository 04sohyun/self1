package day17;

public class NestedClass6 {
	//내부인터페이스
	interface OnClickListener{
		void onClick();
	}
	//필드
	OnClickListener listener;
	//생성자
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	//메소드
	void touch() {
		listener.onClick();
	}
	
}
