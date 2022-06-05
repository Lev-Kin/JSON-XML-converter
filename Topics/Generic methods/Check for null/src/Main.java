// do not remove imports

import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    public static <T> boolean hasNull(T[] a) {
        for (int i = 0; i < a.length; i++) {
            if (Objects.equals(a[i], null)) {
                return true;
            }
        }
        return false;
    }
}
