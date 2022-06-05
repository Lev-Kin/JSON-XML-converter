import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final List<Integer> num = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int shift = scanner.nextInt();

        for (int i = 0; i < shift; i++) {
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            Collections.swap(num, index1, index2);
        }

        for (Integer integer : num) {
            System.out.print(integer + " ");
        }

    }
}
