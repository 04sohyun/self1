package day14;

public class Extends3 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}

class GrandParent{
	public GrandParent() {
		System.out.println("�ֻ��� �θ�����ڴ� ���� ���߿� ȣ������� ���� ���� �����");
	}
}

class Parent extends GrandParent{
	public Parent() {
		System.out.println("�ڽ�Ŭ�����κ��� ȣ��� �� �θ�Ŭ������ ȣ��, �θ�Ŭ���� ���� �� �����");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("���� ���� ȣ�������, ������ �θ������ �Ϸ� �� ���� ���߿� �����");
	}
}