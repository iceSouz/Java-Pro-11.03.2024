package org.tasks.jewels_and_stones;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution jewelCounter = new Solution();

    @Test
    public void testNumJewelsInStones() {
        String jewels = "aA";
        String stones = "aAAbbbbc";

        int expected = 3;

        int actual = jewelCounter.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, actual);
    }
}
