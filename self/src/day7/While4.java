package day7;

public class While4 {
	public static void main(String[] args) {
		int i =1, j=1;
		while(i<=9) {
			while(j<=9) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
				j++;
			}
			j=1; //while�������� �ʱ�ȭ�� ������ ����ߵ�
			i++;
			System.out.println();
		}
	}

}
