package day13;

public class Initial4 {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		p1.print();p2.print();p3.print();
	}
}
class Product{
	static int cnt;
	int serialNo;
	
	{
		cnt++;
		serialNo = cnt;
	}
	
	void print() {
		System.out.println("제품번호: "+serialNo);
	}
}