package day9;

public class String_Args {
	public static void main(String[] args) {
		
		System.out.println("배열의 길이: "+args.length);
		System.out.println("배열의 첫번째 값: "+args[0]);
		System.out.println("배열의 두번째 값: "+args[1]);
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}

}
