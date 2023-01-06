public class Main
{
	public static void main(String[] args){
		
		Pet pet;
		Dog dog = new Dog("Coco", 5, "Shih Tzu");
		Cat cat = new Cat("Nicko", 3, "British Shorthair");
		
		pet = dog;
		System.out.println(pet.makeSound() + " " + "My name is " + pet.getName());
		
		pet = cat;
		System.out.println(pet.makeSound() + " " + "My name is " + pet.getName());
		}
}
