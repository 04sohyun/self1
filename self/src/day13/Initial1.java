package day13;

public class Initial1 {
	public static void main(String[] args) {
		Init1 i1 = new Init1();
		int[] b = i1.a;
		for(int i:b) {
			System.out.println(i);
		}
	}
}
class Init1{
	int[] a = new int[5];
	
	//�ν��Ͻ� �ʱ�ȭ �� - {�ʱ�ȭ ����}
	{
		for(int i=0;i<a.length;i++) {
			int k = (int)(Math.random()*10);
			a[i]=k;
		}
	}
}