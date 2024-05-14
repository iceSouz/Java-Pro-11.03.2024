package org.tasks.jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelryTypes = new HashSet<>();
        int countJewels = 0;

        for (char c : jewels.toCharArray()) {
            jewelryTypes.add(c);
        }

        for (char c : stones.toCharArray()) {
            if (jewelryTypes.contains(c)) {
                countJewels++;
            }
        }

        return countJewels;
    }
}
