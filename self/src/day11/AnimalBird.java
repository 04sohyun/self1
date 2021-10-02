package day11;

public class AnimalBird extends Animal {
	String name = "bird";

	@Override
	void run() {
		System.out.println(name+"가 날아갑니다.");
	}
}
