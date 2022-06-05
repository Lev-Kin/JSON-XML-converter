import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {

        int sum = 0;

        try {
            for (int i = items.size() - 1; i >= 0; i--) {
                Callable<Integer> integerCallable = items.get(i).get();
                sum = sum + integerCallable.call();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sum;
    }


}