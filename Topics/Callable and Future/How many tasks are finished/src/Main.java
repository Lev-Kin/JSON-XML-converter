import java.util.*;
import java.util.concurrent.*;


class FutureUtils {

    public static int howManyIsDone(List<Future> items) {
        return Math.toIntExact(items.stream().takeWhile(Future::isDone).count());
    }
}