package collections;

import java.util.ArrayList;
import java.util.List;

public class NumberListConverter {
    public static void main(String[] args) {
        System.out.println("toList = " + toList(new int[]{1, 2, 3, 4}));
    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> listNumbers = new ArrayList<>();

        for (int number : numbers) {
            listNumbers.add(number);
        }

        return listNumbers;
    }
}
