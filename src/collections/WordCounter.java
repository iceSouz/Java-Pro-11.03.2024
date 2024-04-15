package collections;

import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        List<String> stringList = List.of(
                "apple", "banana", "orange", "apple", "grape",
                "banana", "kiwi", "orange", "mango", "pear",
                "grape", "apple", "banana", "orange", "strawberry"
        );

        calcOccurrence(stringList);
    }

    public static void calcOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> wordCounts = new ArrayList<>();


        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                wordCounts.add(1);
            } else {
                int index = uniqueWords.indexOf(word);
                int count = wordCounts.get(index);
                wordCounts.set(index, count + 1);
            }
        }

        WordCountComparator comparator = new WordCountComparator(uniqueWords, wordCounts);
        Collections.sort(uniqueWords, comparator);

        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + ": " + wordCounts.get(i));
        }
    }
}
