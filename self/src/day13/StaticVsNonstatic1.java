package day13;

public class StaticVsNonstatic1 {
	//�ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;
	void method1() {}
	
	//���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}
	
	//�ν��Ͻ� �޼ҵ忡�� ���� Ŭ�������� static���, instance��� ��� ���� ����
	void method3() {
		field1=0;
		this.field1=0;
		field2=10;
		method1();
		method2();
	}
	
	//static �޼ҵ峻���� static���� ����� ����� ��밡��
	static void method4() {
		//field1=0;
		//this.field1=0; //this Ű���� ���Ұ�
		field2=10;
		//method1();
		//this.method1();//this Ű���� ���Ұ�
		method2();
	}
}
