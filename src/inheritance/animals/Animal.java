package inheritance.animals;

public abstract class Animal {
    private static int countAnimals;
    protected String petName;

    protected Animal(String petName) {
        this.petName = petName;
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
