import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int h = scanner.nextInt();

        if (h <= b && h >= a) {
            System.out.println("Normal");
        } else if (h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
    }
}
