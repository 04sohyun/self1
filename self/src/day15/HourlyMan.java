package day15;

public class HourlyMan extends Employee {
  int workHour, moneyPerHour;
  
  public HourlyMan(String name, int workHour, int moneyPerHour) {
	  super(name);
	  this.workHour=workHour;
	  this.moneyPerHour=moneyPerHour;
  }

@Override
int computePay() {
	sal =  workHour*moneyPerHour;
	return sal;
}
  
}
