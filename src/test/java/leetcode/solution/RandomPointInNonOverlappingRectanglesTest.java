package leetcode.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;


class RandomPointInNonOverlappingRectanglesTest {

    @BeforeEach
    void setUp(){
        System.out.println("---------------------------------------");
    }

    @Test
    void testPickFromOne() {
        int[][] rects = {{1, 1, 5, 5}};

        testPick(rects);
    }

    @Test
    void testPickFromFour() {
        int[][] rects = {{1, 1, 5, 5}, {1, 6, 3, 8}, {6, 1, 8, 3}, {8, 8, 10, 10}};

        testPick(rects);
    }

    @Test
    void testPickFromFourLarge() {
        int[][] rects = {{82918473, -57180867, 82918476, -57180863},
                {83793579, 18088559, 83793580, 18088560},
                {66574245, 26243152, 66574246, 26243153},
                {72983930, 11921716, 72983934, 11921720}};

        testPick(rects);
    }

    private void testPick(int[][] rects) {
        RandomPointInNonOverlappingRectangles randomPointInNonOverlappingRectangles
                = new RandomPointInNonOverlappingRectangles(rects);
        int[] rectCount = new int[rects.length];
        IntStream.range(0, 10000).forEach(i -> {
            int[] result = randomPointInNonOverlappingRectangles.pick();
            int rectOfResult = searchInRects(result, rects);
            rectCount[rectOfResult] += 1;
            assertTrue(rectOfResult >= 0);
        });
        System.out.println(Arrays.toString(rects));
        System.out.println(Arrays.toString(rectCount));
    }

    public int searchInRects(int[] target, int[][] rects){

        for (int i = 0; i < rects.length; i++) {
            int[] rect = rects[i];
            int x = target[0], y = target[1];
            int x1 = rect[0], y1 = rect[1], x2 = rect[2], y2 = rect[3];

            if(x >= x1 && x <= x2 && y >= y1 && y <= y2){
                return i;
            }
        }
        return -1;
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme