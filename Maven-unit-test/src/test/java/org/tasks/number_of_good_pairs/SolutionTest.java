package org.tasks.number_of_good_pairs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution pairAnalyzer = new Solution();

    @Test
    public void testNumIdenticalPairs() {
        int[] nums = {1, 2, 3, 1, 1, 3};

        int expected = 4;

        int actual = pairAnalyzer.numIdenticalPairs(nums);

        Assert.assertEquals(expected, actual);
    }
}
