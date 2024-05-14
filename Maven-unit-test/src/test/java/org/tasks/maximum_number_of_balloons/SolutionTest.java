package org.tasks.maximum_number_of_balloons;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution balloonCounter = new Solution();

    @Test
    public void testMaxNumberOfBalloons() {
        String text = "loonbalxballpoon";

        int expected = 2;

        int actual = balloonCounter.maxNumberOfBalloons(text);

        Assert.assertEquals(expected, actual);
    }
}
