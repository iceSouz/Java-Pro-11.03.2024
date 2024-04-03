package collections;

import java.util.List;

public class StringCounter {
    public static void main(String[] args) {
        List<String> stringList = List.of(
                "apple", "banana", "orange", "apple", "grape",
                "banana", "kiwi", "orange", "mango", "pear",
                "grape", "apple", "banana", "orange", "strawberry"
        );

        System.out.println("Count of matches = " + countOccurrence(stringList, "banana"));
    }

    public static int countOccurrence(List<String> stringList, String targetString) {
        int countOfMatches = 0;
        for (String string : stringList) {
            if (string.equals(targetString)) {
                countOfMatches++;
            }
        }

        return countOfMatches;
    }
}
