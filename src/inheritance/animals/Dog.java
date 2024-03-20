package inheritance.animals;

import inheritance.utils.DistanceUtils;

public class Dog extends Animal {
    private static int countDogs;

    public Dog(String petName) {
        super(petName);
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    @Override
    public void run(int distance) {
        DistanceUtils.checkNegativeDistance(distance);
        DistanceUtils.validateDistance(distance, DistanceUtils.MAX_DISTANCE_RUN_FOR_DOGS,
                super.petName, "run");

        System.out.printf("%s ran %d m.\n", super.petName, distance);
    }

    @Override
    public void swim(int distance) {
        DistanceUtils.checkNegativeDistance(distance);
        DistanceUtils.validateDistance(distance, DistanceUtils.MAX_DISTANCE_SWIM_FOR_DOGS,
                super.petName, "swim");

        System.out.printf("%s swam %d m.\n", super.petName, distance);
    }
}
