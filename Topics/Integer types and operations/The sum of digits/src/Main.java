import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        final int a = n / 100;
        final int b = n % 100 / 10;
        final int c = n % 10;

        System.out.println(a + b + c);
    }
}
