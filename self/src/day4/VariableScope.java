package day4;

public class VariableScope {

	public static void main(String[] args) {
		//main메소드 블럭내에서 선언된 로컬변수
		int var1;
		
		if(true) {
			//main메소드 내의 if블럭에서 선언된 로컬변수
			int var2;
			var1 = 2;
			var2 = 3;
			int result = var1 + var2;
			System.out.println(result);  //5
		}
		
		while(true) {
			//main메소드 내의 while블럭내에서 선언된 로컬변수
			int var3;
			System.out.println(var1);  //2
			var1 = 3;
			var3 = 5;
			int result2 = var1 + var3;
			System.out.println(result2);  //8
			break; //반복문을 빠져나가게 하는 명령문
			
		}
		System.out.println(var1);  //3
		//자신이 선언된 블럭내에서만 가능
		//System.out.println(var2);
		//System.out.println(var3);
	}

}
