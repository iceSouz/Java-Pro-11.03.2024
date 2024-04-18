package tasks_from_leetcode;

public class PalindromeChecker {
    public static boolean isPalindrome(String inputData) {
        String cleanedString = inputData.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(cleanedString);
        sb.reverse();

        return sb.toString().equalsIgnoreCase(cleanedString);
    }
}
