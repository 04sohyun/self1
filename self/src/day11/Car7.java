package day11;

public class Car7 {
	
 boolean isLeftGas() {
	 int gas = 5;
	 if(gas==0) {
		 System.out.println("gas가 없습니다.");
		 return false;
	 }
	 System.out.println("gas가 있습니다.");
	 return true;
 }
	

}
