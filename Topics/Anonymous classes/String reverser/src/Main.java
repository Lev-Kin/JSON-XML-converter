import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(line);
        stringBuilder.reverse();
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                return String.valueOf(stringBuilder);
            }
        };

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}