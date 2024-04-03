package collections;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberFinder {
    public static void main(String[] args) {
        List<Integer> unique = findUnique(List.of(1, 2, 3, 3, 2, 2, 4, 5, 10, 1));
        System.out.println("Unique = " + unique);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        return uniqueNumbers;
    }
}
