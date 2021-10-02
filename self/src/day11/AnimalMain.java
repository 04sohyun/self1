package day11;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		AnimalFish fish = new AnimalFish();
		AnimalBird bird = new AnimalBird();
		AnimalDog dog = new AnimalDog();
		
		System.out.println(animal.name);
		System.out.println(fish.name);
		System.out.println(bird.name);
		System.out.println(dog.name);
		animal.run();
		fish.run();
		bird.run();
		dog.run();
		
	}

}
