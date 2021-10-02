package day11;

public class AnimalDog extends Animal {
	String name = "강아지";

	@Override
	void run() {
		System.out.println(name+"가 수영합니다.");
	}
}
