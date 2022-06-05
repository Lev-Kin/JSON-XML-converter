import java.util.Scanner;

enum DaysOfTheWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(scanner.next());
        int numLetters;

        switch (day) {
            case MONDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            case THURSDAY:
                numLetters = 8;
                break;
            case FRIDAY:
                numLetters = 6;
                break;
            case SATURDAY:
                numLetters = 8;
                break;
            case SUNDAY:
                numLetters = 6;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }

        System.out.println(numLetters);
    }
}