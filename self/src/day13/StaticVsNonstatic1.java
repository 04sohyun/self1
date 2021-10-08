package day13;

public class StaticVsNonstatic1 {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 메소드에서 같은 클래스내의 static멤버, instance멤버 모두 접근 가능
	void method3() {
		field1=0;
		this.field1=0;
		field2=10;
		method1();
		method2();
	}
	
	//static 메소드내에는 static으로 선언된 멤버만 사용가능
	static void method4() {
		//field1=0;
		//this.field1=0; //this 키워드 사용불가
		field2=10;
		//method1();
		//this.method1();//this 키워드 사용불가
		method2();
	}
}
