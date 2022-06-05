// do not remove imports

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {

    public static <T> T getFirst(T[] a) {
        if (a.length == 0) {
            return null;
        } else {
            return a[0];
        }
    }

}