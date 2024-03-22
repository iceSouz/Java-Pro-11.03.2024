package inheritance;

import inheritance.animals.Animal;
import inheritance.animals.Cat;
import inheritance.animals.Dog;

public class Application {
    public static void main(String[] args) {
        Animal catMurka = new Cat("Murka");
        catMurka.run(200);
        catMurka.swim(244);

        System.out.println();

        Animal dogBobik = new Dog("Bobik");
        dogBobik.run(23);
        dogBobik.swim(10);

        System.out.println();

        System.out.println("Cat.getCountCats() = " + Cat.getCountCats());
        System.out.println("Dog.getCountDogs() = " + Dog.getCountDogs());

        System.out.println("Animal.getCountAnimals() = " + Animal.getCountAnimals());
    }
}
