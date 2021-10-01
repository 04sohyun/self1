package day9;

public class Copy3 {
	public static void main(String[] args) {
		//얕은복사
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;
		
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int b:arr2) {
			System.out.print(b+" ");
		}
		System.out.println("\n------------");
		
		//변수명.hashCode()
		//객체가 저장된 주소값을 해쉬방정식으로 출력한 값으로 객체가 서로 같은지 다른지 구분할 때 사용
		System.out.println("arr1의 hash코드값: "+arr1.hashCode());
		System.out.println("arr2의 hash코드값: "+arr2.hashCode());
		
	}

}
