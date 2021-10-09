package day14;

public class Extends3 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}

class GrandParent{
	public GrandParent() {
		System.out.println("최상위 부모생성자는 가장 나중에 호출되지만 가장 먼저 실행됨");
	}
}

class Parent extends GrandParent{
	public Parent() {
		System.out.println("자식클래스로부터 호출된 후 부모클래스를 호출, 부모클래스 실행 후 실행됨");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("가장 먼저 호출되지만, 실행은 부모생성자 완료 후 가장 나중에 실행됨");
	}
}