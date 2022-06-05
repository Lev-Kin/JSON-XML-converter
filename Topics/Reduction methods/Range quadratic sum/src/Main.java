import java.util.stream.*;

class QuadraticSum {
    public static long rangeQuadraticSum(int fromIncl, int toExcl) {
        return LongStream.range(fromIncl, toExcl)
                .map(number -> number * number)
                .sum(); // write your code with streams here
    }
}