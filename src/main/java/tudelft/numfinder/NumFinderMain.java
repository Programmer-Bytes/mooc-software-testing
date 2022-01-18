package tudelft.numfinder;

import java.util.Arrays;
import java.util.List;

public class NumFinderMain {

    public static void main(String[] args) {
        NumFinder numFinder = new NumFinder();
        List<int[]> testCases = List.of(
                // requirement-based test case
                new int[]{4, 25, 7, 9}
                // boundary analysis based test case
                , new int[]{1, 1, 1, 1}
                // a stricter boundary case
//                , null
        );

        testCases.forEach(testCase -> {
                    numFinder.find(testCase);
                    System.out.printf(
                            "(minimum, maximum)=(%d, %d) in array=%s%n", numFinder.getLargest(), numFinder.getSmallest(), Arrays.toString(testCase)
                    );
                }
        );

    }
}
