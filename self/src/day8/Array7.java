package day8;

public class Array7 {
	public static void main(String[] args) {	
		double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//���� for���� �̿��Ͽ� �հ� ��� ���
		double sum = 0;
		for(double s:scores) {
			sum += s;
		}
		System.out.println("����:"+sum);//308.59999999999997
		System.out.println("����:"+(int)(sum*100)/100.0);//308.59
		System.out.printf("����:%.2f\n",sum);//308.60
		System.out.println("���:"+sum/scores.length);//61.71999999999999
		System.out.println("����:"+(int)(sum/scores.length*100)/100.0);//61.71
		System.out.printf("����:%.2f\n",sum/scores.length);//61.72
	}

}
