package day13;

public class Initial2 {
	public static void main(String[] args) {
		for(int i:Init2.a) {
			System.out.println(i);
		}
	}
}
class Init2{
	static int[] a = new int[5];
	
	//static �ʱ�ȭ �� - static{�ʱ�ȭ����}
	static {
		for(int i=0;i<a.length;i++) {
			int k = (int)(Math.random()*10);
			a[i] = k;
		}
	}
}