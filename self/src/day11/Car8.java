package day11;

public class Car8 {

 int gas;
 
 void run() {
	 while(true) {
		 if(gas>0) {
			 System.out.println("�޸��ϴ�.(gas�ܷ�:"+gas+")");
			 gas--;
		 }else {
			 System.out.println("����ϴ�.(gas�ܷ�:"+gas+")");
			 return; //�޼ҵ� ����
		 }
	 }
 }
}
