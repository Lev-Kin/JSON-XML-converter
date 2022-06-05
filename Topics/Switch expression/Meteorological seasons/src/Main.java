import java.util.Scanner;

enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seasons season = Seasons.valueOf(scanner.nextLine().toUpperCase());

       // enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }
        int temperature = 0;
        switch (season) {
            case SPRING:
            case AUTUMN:
                temperature = 20;
                break;
            case SUMMER:
                temperature = 37;
                break;
            case WINTER:
                temperature = 1;
                break;
            default:
                throw new IllegalStateException("Invalid name of Seasons.");
        }

        System.out.println(temperature);
    }
}