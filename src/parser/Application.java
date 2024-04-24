package parser;


import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        FileManager fileManager = new FileManager();
        BookAnalyzer bookAnalyzer = new BookAnalyzer();

        String nameBook = userInterface.promptForBookName(fileManager);

        String bookContent = fileManager.readBookFile(nameBook);
        List<String> words = TextUtil.splitLinesIntoWords(bookContent);
        Map<String, Integer> wordOccurrences = bookAnalyzer.countWordOccurrences(words);
        int totalWords = bookAnalyzer.countWordsInBook(words);
        fileManager.writeStatisticsToFile(nameBook, wordOccurrences, totalWords);

        userInterface.displayStatistics(wordOccurrences, totalWords);
    }
}
