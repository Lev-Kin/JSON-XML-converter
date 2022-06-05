import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final List<Integer> num1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final List<Integer> num2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int f = Collections.indexOfSubList(num1, num2);
        int l = Collections.lastIndexOfSubList(num1, num2);

        System.out.println(f + " " + l);
    }
}