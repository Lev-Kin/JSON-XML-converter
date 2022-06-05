import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (Integer number : numbers) {

            if (number % 2 != 0) {
                odd.add(number);
            } else {
                even.add(number);
            }

        }



        Collections.sort(odd);
        Collections.sort(even);

        Collections.reverse(even);

        odd.addAll(even);

        return odd;
    }
}