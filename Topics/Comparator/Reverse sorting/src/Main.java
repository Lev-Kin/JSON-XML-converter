import java.util.Comparator;
import java.util.List;

class Utils {

    public static void sortStrings(List<String> strings) {
        strings.sort((i1, i2) -> i1.equals(i2) ? 0 : i2.compareTo(i1));
    }
}