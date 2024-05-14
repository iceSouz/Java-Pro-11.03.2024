package org.tasks.maximum_number_of_balloons;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final String TARGET_WORD = "balloon";

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> textFrequency = new HashMap<>();
        Map<Character, Integer> targetWordFrequency = new HashMap<>();

        for (char c : text.toCharArray()) {
            textFrequency.put(c, textFrequency.getOrDefault(c, 0) + 1);
        }

        for (char c : TARGET_WORD.toCharArray()) {
            targetWordFrequency.put(c, targetWordFrequency.getOrDefault(c, 0) + 1);
        }

        int maxCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : targetWordFrequency.entrySet()) {
            char key = entry.getKey();
            int needed = entry.getValue();
            int countInText = textFrequency.getOrDefault(key, 0);

            maxCount = Math.min(maxCount, countInText / needed);
        }

        return maxCount;
    }
}