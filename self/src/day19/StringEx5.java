package day19;

public class StringEx5 {
	public static void main(String[] args) {
		String str = "Korea Fighting !!";
		//charAt()
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));//!! gnithgiF aeroK
		}
		System.out.println();
		for(int i=0;i<str.length();i+=2) {
			System.out.print(str.charAt(i));//KraFgtn !
		}
		System.out.println();
		
		//valueof
		int i = 100;
		String str1 = i+" ";
		String str2 = String.valueOf(i);
		System.out.println(str1+str2);//100 100
		
		String s1 = "200";
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.valueOf(s1);
		System.out.println(i1+i2);//400
		
		//indexOf()
		String str3 = "Hello.java.´ë¹Ú.hh";
		int index1 = str3.indexOf(".");
		int index2 = str3.lastIndexOf(".");
		System.out.println(index1);//5
		System.out.println(index2);//13
		
		int index3 = str3.indexOf("--");
		System.out.println(index3);//-1
		
	}
}
