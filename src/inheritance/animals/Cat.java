package inheritance.animals;

import inheritance.utils.DistanceUtils;

public class Cat extends Animal {
    private static int countCats;

    public Cat(String petName) {
        super(petName);
        countCats++;
    }

    public static int getCountCats() {
        return countCats;
    }

    @Override
    public void run(int distance) {
        DistanceUtils.checkNegativeDistance(distance);
        DistanceUtils.validateDistance(distance, DistanceUtils.MAX_DISTANCE_RUN_FOR_CATS,
                super.petName, "run");

        System.out.printf("%s ran %d m.\n", super.petName, distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim!");
    }
}
