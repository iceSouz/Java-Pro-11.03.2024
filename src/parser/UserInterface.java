package parser;

import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    private final String inputNameBook = "Please enter the name of the book!";
    private final String wrongNameBook = "You entered the wrong name of book. Please, try again.";

    // Prompts the user for the book name and checks if it exists
    public String promptForBookName(FileManager manager) {
        displayMessage(inputNameBook);
        String nameBook;

        try(Scanner scanner = new Scanner(System.in)) {
            while (true) {
                nameBook = scanner.nextLine();

                if (manager.checkBookExists(nameBook)) {
                    return nameBook;
                }

                System.err.print(wrongNameBook + System.lineSeparator());
            }
        }
    }

    // Displays the statistics in the console
    public void displayStatistics(Map<String, Integer> wordCounts, int totalWords) {
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.print(entry.getKey() + ": " + entry.getValue() + System.lineSeparator()));

        displayMessage("Total words: " + totalWords);
    }

    // Displays a message in the console
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
