package leetcode.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayIITest {
    SearchInRotatedSortedArrayII searchInRotatedSortedArrayII = new SearchInRotatedSortedArrayII();

    @Test
    void testSearch_0() {
        boolean result = searchInRotatedSortedArrayII.search(new int[]{2,5,6,0,0,1,2}, 0);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testSearch_3() {
        boolean result = searchInRotatedSortedArrayII.search(new int[]{2,5,6,0,0,1,2}, 3);
        Assertions.assertEquals(false, result);
    }

    @Test
    void testSearch_1() {
        boolean result = searchInRotatedSortedArrayII.search(new int[]{1, 2, 1}, 1);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testSearch_3_of_1311() {
        boolean result = searchInRotatedSortedArrayII.search(new int[]{1, 3, 1, 1}, 3);
        Assertions.assertEquals(true, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme