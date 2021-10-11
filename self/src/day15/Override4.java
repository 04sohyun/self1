package day15;

public class Override4 {
	public static void main(String[] args) {
		A4 a4 = new A4();
		a4.set();
	}
 private int weight;
 int age;
 protected int height;
 public String name;
 
 public int getWeight() {
	 return weight;
 }
 public void setWeight(int weight) {
	 this.weight=weight;
 }
}
class A4 extends Override4{
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		//weight = 99;
		setWeight(99);
	}
}