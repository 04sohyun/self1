package day19;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		A a = new A();
		a.f1 = "field1";
		a.i1 = 10;
		
		System.out.println(a.toString());
		
		//DateŬ������ toString()�� ��¥��������ϵ��� ������ ��
		Date date = new Date();
		System.out.println(date.toString());
		
		//System.out.print()�޼ҵ��� �Ű������� ���������� ���޵Ǹ� toString()�ڵ�ȣ��
		System.out.println(a);
		System.out.println(date);
	}
}

class A extends Object{
	String f1;
	int i1;
	
	@Override
	public String toString() {
		return "A [f1=" + f1 + ", i1=" + i1 + "]";
	}
	
}