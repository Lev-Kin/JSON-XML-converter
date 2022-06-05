import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static List<String> extractCodes(List<String> codes) {

        return codes.stream()
                .dropWhile(secret -> !"#0000".equals(secret))
                .skip(1)
                .takeWhile(secret -> !"#FFFF".equals(secret))
                .collect(Collectors.toList());
    }

    /* Please do not modify the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> codes = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        System.out.println(String.join(" ", extractCodes(codes)));
    }
}