package org.tasks.number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int totalPairs = 0;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int countMatchesNum = entry.getValue();

            if (countMatchesNum > 1) {
                int pairCombinations = countMatchesNum * (countMatchesNum - 1) / 2;
                totalPairs += pairCombinations;
            }
        }

        return totalPairs;
    }
}
