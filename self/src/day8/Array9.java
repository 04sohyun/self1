package day8;

public class Array9 {
	public static void main(String[] args) {
		int[] score = {76,45,34,89,100,50,90,92};
		
		//max������ �迭�� ���麸�� �����ϰ� ���� �� �����Ͽ� ����
		//min������ �迭�� ���麸�� �����ϰ� ū �� �����Ͽ� ����
		int sum=0, max=0, min=100;
		for(int s:score) {
			sum+=s;
			if(max<s) max=s;
			if(min>s) min=s;
		}
		
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
		System.out.println("�հ�:"+sum);
		System.out.println("���:"+sum/(double)score.length);
		
		
		
	}

}
