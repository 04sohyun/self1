package day19;

public class StringEx2 {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		
		//���ڿ� ã�� indexOf()
		int index = ssn.indexOf("-");
		System.out.println(index);//6
		
		//���� ���� charAt()
		char gender = ssn.charAt(index+1);//1
		switch(gender) {
		case '1':
		case '3': System.out.println("��"); break;
		case '2':
		case '4': System.out.println("��"); break;
		}
		
		//���ڿ� ����
		char[] chars = new char[ssn.length()];//13
		for(int i=0;i<chars.length;i++) {
			chars[i]=ssn.charAt(i);
			System.out.print(chars[i]);//010624-1230123
		}
		
	}
}
