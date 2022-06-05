import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();

        System.out.println(checkIP(ip) ? "YES" : "NO");
    }

    private static boolean checkIP(String ip) {

        try {
            int[] ipParts = Arrays.stream(ip.split("\\.")).mapToInt(Integer::parseInt).toArray();
            if (ipParts.length == 4 && !ip.endsWith(".")) {
                for (int i = 0; i < 4; i++) {
                    if (ipParts[i] < 0 || ipParts[i] > 255) {
                        return false;
                    }
                }
                return true;
            }
        } catch (NumberFormatException nfe) {
        }
        return false;
    }
}