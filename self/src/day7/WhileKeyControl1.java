package day7;

import java.io.IOException;

public class WhileKeyControl1 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("=================");
			System.out.println("1.���� | 2.���� | 3.����");
			System.out.println("=================");
			System.out.println("����> ");
			
			int i = System.in.read()-'0';
			System.in.read();//\r
			System.in.read();//\n
			
			if(i==1) {
				speed++;
				System.out.println("���� �ӵ���:"+speed);
			}else if(i==2) {
				speed--;
				System.out.println("���� �ӵ���:"+speed);
			}else if(i==3) {
				run = !run;
			}
			
		}
		System.out.println("����");
	}

}
