package day17;

public class NestedClass6_1 {
	NestedClass6 button1 = new NestedClass6();
	NestedClass6 button2 = new NestedClass6();

	//�͸�ü����
	NestedClass6.OnClickListener listener = new NestedClass6.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	NestedClass6_1(){
		button1.setListener(listener);
	}
}
