package parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextUtil {

    // Splits a string of text into individual words using non-word characters as delimiters.
    public static List<String> splitLinesIntoWords(String textBook) {
        String[] splitWords = textBook.split("\\W+");

        return new ArrayList<>(Arrays.asList(splitWords));
    }
}
