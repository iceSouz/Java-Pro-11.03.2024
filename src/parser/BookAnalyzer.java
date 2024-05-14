package parser;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAnalyzer {

    // Finds the top 10 most frequent words in a list, case-insensitive.
    public Map<String, Integer> findTopWords(List<String> words) {
        Map<String, Integer> countEveryWord = words.stream()
                .collect(Collectors.toMap(
                        String::toLowerCase,
                        k -> 1,
                        Integer::sum
                ));

        return countEveryWord.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
    }

    // Counts the number of unique words in a list.
    public int countUniqueWords(List<String> words) {
        return new HashSet<>(words).size();
    }

    // Counts occurrences of all words in a list, case-insensitive.
    public Map<String, Integer> countWordOccurrences(List<String> words) {
        return words.stream()
                .collect(Collectors.toMap(
                        String::toLowerCase,
                        k -> 1,
                        Integer::sum
                ));
    }

    // Calculates the total number of words in a list.
    public int countWordsInBook(List<String> textBook) {
        return textBook.size();
    }
}
