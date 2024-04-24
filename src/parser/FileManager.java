package parser;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static java.nio.file.Files.*;

public class FileManager {
    private final String pathSrc = "src/"; // Directory where the books are stored

    // Checks if the specified book exists in the directory
    public boolean checkBookExists(String bookName) {
        Path directorySrc = Paths.get(pathSrc);

        try (DirectoryStream<Path> stream = newDirectoryStream(directorySrc)) {
            for (Path path : stream) {
                if (path.getFileName().toString().equalsIgnoreCase(bookName + ".txt")) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }

        return false;
    }

    // Reads the book file and returns the content as a single string
    public String readBookFile(String bookName) {
        Path path = Paths.get(pathSrc, bookName + ".txt");
        StringBuilder sb = new StringBuilder();
        String line;

        try (BufferedReader br = new BufferedReader(Files.newBufferedReader(path))) {
            while ((line = br.readLine()) != null)
                sb.append(line).append(" ");
        } catch (IOException e) {
            System.err.print("Error: " + e.getMessage());
            return null;
        }

        return sb.toString();
    }

    // Writes the analysis statistics to a file
    public boolean writeStatisticsToFile(String bookName, Map<String, Integer> wordCounts, int totalWords) {
        Path path = Paths.get(bookName + "_statistic.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }

            writer.write(System.lineSeparator() + "Total words: " + totalWords);
        } catch (IOException e) {
            System.err.print("Error: " + e.getMessage());
            return false;
        }

        return true;
    }
}
