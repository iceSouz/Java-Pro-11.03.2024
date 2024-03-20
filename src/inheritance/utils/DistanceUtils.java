package inheritance.utils;

public class DistanceUtils {
    public static final int MAX_DISTANCE_RUN_FOR_CATS = 200;
    public static final int MAX_DISTANCE_RUN_FOR_DOGS = 500;
    public static final int MAX_DISTANCE_SWIM_FOR_DOGS = 10;

    public static void checkNegativeDistance(int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("The distance cannot be less than 0.");
        }
    }

    public static void validateDistance(int distance, int maxDistance, String nameAnimal, String activity) {
        if (distance > maxDistance) {
            throw new IllegalArgumentException(nameAnimal + " cannot " + activity + " a distance of more than " +
                    maxDistance + " m.");
        }
    }
}
