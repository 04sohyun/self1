package day8;

public class Array11 {
	public static void main(String[] args) {
		//1���� �迭�� �������� ����
		int[] score = {76,45,34,89,100,50,90,92};
		
		int temp=0; //�ӽ÷� ���� ������ ����
		for(int i=0;i<score.length;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i]<score[j]) {
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
		}
		//��������
		for(int s:score) {
			System.out.print(s+" ");
		}
		System.out.println();
		//��������
		for(int i=(score.length-1);i>=0;i--) {
			System.out.print(score[i]+" ");
		}
	}

}
