package tasks_from_leetcode;


public class TwoSumFinder {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];

            if (sum == target) {
                return new int[]{i, i + 1};
            }
        }

        return null;
    }
}
