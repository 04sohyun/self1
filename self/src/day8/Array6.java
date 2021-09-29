package day8;

public class Array6 {
	public static void main(String[] args) {
		int[] score = {78,98,54,76,87};
		System.out.println("¹è¿­ÀÇ °¹¼ö:"+score.length);
		
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		System.out.println("ÃÑÁ¡:"+sum);
		System.out.println("Æò±Õ:"+sum/(double)score.length);
		
		//Çâ»óµÈ for¹®
		sum=0;
		for(int n:score) {
			sum += n;
		}
		System.out.println("ÃÑÁ¡:"+sum);
	}

}
