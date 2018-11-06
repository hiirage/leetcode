package leetcode.solution;

import java.util.Random;
import java.util.stream.Stream;

/**
 * #497
 */
public class RandomPointInNonOverlappingRectangles {

    private final int[] areaSumArray;

    private final int[][] rectArray;

    private final Random random = new Random();

    public RandomPointInNonOverlappingRectangles(int[][] rects){
        areaSumArray = Stream.of(rects)
                .mapToInt(rec -> (rec[0] - rec[2]) * (rec[1] - rec[3]))
                .map(Math::abs)
                .toArray();

        int sum = 0;
        for(int i = 0; i < areaSumArray.length; i++) {
            areaSumArray[i] = sum += areaSumArray[i];
        }
        this.rectArray = rects;
    }

    public int[] pick(){
        double randomDouble = random.nextDouble() * getAreaSum();
        int[] rect = mapDoubleToRectAccordingToArea(randomDouble);
        return randomPointOfRect(rect);
    }

    private int[] randomPointOfRect(int[] rect) {
        int x1 = rect[0], y1 = rect[1], x2 = rect[2], y2 = rect[3];

        int x = random.nextInt(x2 - x1 + 1) + x1;
        int y = random.nextInt(y2 - y1 + 1) + y1;

        return new int[]{x, y};
    }

    private int[] mapDoubleToRectAccordingToArea(double r) {
        for(int i = 0; i < areaSumArray.length; i++){
            if(r < areaSumArray[i]){
                return rectArray[i];
            }
        }
        return new int[]{};
    }

    private int getAreaSum(){
        return areaSumArray[areaSumArray.length - 1];
    }
}
