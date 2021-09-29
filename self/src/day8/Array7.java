package day8;

public class Array7 {
	public static void main(String[] args) {	
		double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
		
		//Çâ»óµÈ for¹®À» ÀÌ¿ëÇÏ¿© ÇÕ°ú Æò±Õ Ãâ·Â
		double sum = 0;
		for(double s:scores) {
			sum += s;
		}
		System.out.println("ÃÑÇÕ:"+sum);//308.59999999999997
		System.out.println("ÃÑÇÕ:"+(int)(sum*100)/100.0);//308.59
		System.out.printf("ÃÑÇÕ:%.2f\n",sum);//308.60
		System.out.println("Æò±Õ:"+sum/scores.length);//61.71999999999999
		System.out.println("ÃÑÇÕ:"+(int)(sum/scores.length*100)/100.0);//61.71
		System.out.printf("ÃÑÇÕ:%.2f\n",sum/scores.length);//61.72
	}

}
