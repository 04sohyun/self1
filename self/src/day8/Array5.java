package day8;

public class Array5 {
	public static void main(String[] args) {
		int[] n = new int[5];
		n[0] =12; n[1]=20;
		n[2]=67; n[3] = 567;
		n[4]=21;
		
		System.out.println("�迭 ����� ����: "+n.length);
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]="+n[i]);
		}
		
		//���� for������ ���ϱ�
		for(int i:n) {
			System.out.print(i+" ");//12 20 67 567 21
		}
	}

}