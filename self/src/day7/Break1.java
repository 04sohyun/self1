package day7;

public class Break1 {
	public static void main(String[] args) {
		int i = 0, sum=0;
		while(true) {
			i++;
			sum += i;
			if(i==50) break;
		}
		System.out.println(sum);//1275
	}

}
