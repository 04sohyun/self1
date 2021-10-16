package day17;

public class NestedClass6_1 {
	NestedClass6 button1 = new NestedClass6();
	NestedClass6 button2 = new NestedClass6();

	//익명객체구현
	NestedClass6.OnClickListener listener = new NestedClass6.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	NestedClass6_1(){
		button1.setListener(listener);
	}
}
