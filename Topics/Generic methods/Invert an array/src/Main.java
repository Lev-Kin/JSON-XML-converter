// do not remove imports

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    public static <T> T[] invert(T[] a) {
        Collections.reverse(Arrays.asList(a));
        return a;
    }
}
