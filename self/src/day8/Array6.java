package day8;

public class Array6 {
	public static void main(String[] args) {
		int[] score = {78,98,54,76,87};
		System.out.println("�迭�� ����:"+score.length);
		
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		System.out.println("����:"+sum);
		System.out.println("���:"+sum/(double)score.length);
		
		//���� for��
		sum=0;
		for(int n:score) {
			sum += n;
		}
		System.out.println("����:"+sum);
	}

}
