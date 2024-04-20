package tasks_from_leetcode;

import java.util.*;

public class ArrayDuplicateChecker {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }

        return false;
    }
}
