package day12;

public class Method8 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.add(10, 31);
		a1.print("�ȳ�");
	}
}
class A1{
	//�޼ҵ�1
	void add(int x, int y) {
		System.out.println("�հ�:"+(x+y));
	}
	//�޼ҵ�2
	void print(String msg) {
		System.out.println("���޻���:"+msg);
	}
}