package day17;

public class NestedClass6 {
	//�����������̽�
	interface OnClickListener{
		void onClick();
	}
	//�ʵ�
	OnClickListener listener;
	//������
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	//�޼ҵ�
	void touch() {
		listener.onClick();
	}
	
}
