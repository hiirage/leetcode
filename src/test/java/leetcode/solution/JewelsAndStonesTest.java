package leetcode.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * #771
 */
class JewelsAndStonesTest {
    JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    void testNumJewelsInStones_3() {
        int result = jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
        Assertions.assertEquals(3, result);
    }

    @Test
    void testNumJewelsInStones_0() {
        int result = jewelsAndStones.numJewelsInStones("zz", "ZZZ");
        Assertions.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme