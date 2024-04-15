package collections;

import java.util.*;

public class WordOccurrencesAnalyzer {
    public static void main(String[] args) {
        List<String> stringList = List.of(
                "apple", "banana", "orange", "apple", "grape",
                "banana", "kiwi", "orange", "mango", "pear",
                "grape", "apple", "banana", "orange", "strawberry"
        );

        List<String> occurrence = findOccurrence(stringList);

        for (String value : occurrence) {
            System.out.println(value);
        }
    }

    public static List<String> findOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> wordsCounts = new ArrayList<>();
        List<String> wordOccurrences = new ArrayList<>();

        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                wordsCounts.add(1);
            } else {
                int index = uniqueWords.indexOf(word);
                int count = wordsCounts.get(index);
                wordsCounts.set(index, count + 1);
            }
        }

        WordCountComparator comparator = new WordCountComparator(uniqueWords, wordsCounts);
        Collections.sort(uniqueWords, comparator);

        for (int i = 0; i < uniqueWords.size(); i++) {
            wordOccurrences.add("{name: \"" + uniqueWords.get(i) + "\", occurrence: " + wordsCounts.get(i) + "}");
        }

        return wordOccurrences;
    }
}
