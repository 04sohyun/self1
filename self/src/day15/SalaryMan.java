package day15;

public class SalaryMan extends Employee {
	private int annualSal;
	public SalaryMan(String name, int annualSal) {
	  super(name);
	  this.annualSal=annualSal;
  }
	@Override
	int computePay() {
		sal = annualSal/12;
		return sal;
	}
	
}
