package day19;

public class StringSplitEx1 {
	public static void main(String[] args) {
		String str = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		
		String[] names = str.split("&|,|-");
		for(String name : names) {
			System.out.print(name+" ");
		}
	}
}
