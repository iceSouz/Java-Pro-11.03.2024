package tasks_from_leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumFinder {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (numIndex.containsKey(target - currentNum)) {
                return new int[]{numIndex.get(target - currentNum), i};
            }
            numIndex.put(nums[i], i);
        }

        return new int[0];
    }
}
