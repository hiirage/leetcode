package leetcode.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddDigitsTest {
    AddDigits addDigits = new AddDigits();

    @Test
    void test0() {
        int result = addDigits.addDigits(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void test38() {
        int result = addDigits.addDigits(38);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test100() {
        int result = addDigits.addDigits(100);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test567() {
        int result = addDigits.addDigits(567);
        Assertions.assertEquals(9, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme