package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordCountComparator implements Comparator<String> {
    private List<String> uniqueWords;
    private List<Integer> wordCounts;

    public WordCountComparator(List<String> uniqueWords, List<Integer> wordCounts) {
        this.uniqueWords = new ArrayList<>(uniqueWords);
        this.wordCounts = new ArrayList<>(wordCounts);
    }

    @Override
    public int compare(String word1, String word2) {
        int count1 = wordCounts.get(uniqueWords.indexOf(word1));
        int count2 = wordCounts.get(uniqueWords.indexOf(word2));

        return Integer.compare(count2, count1);
    }
}
