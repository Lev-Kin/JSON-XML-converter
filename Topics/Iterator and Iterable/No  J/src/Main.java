import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        List<String> stringList = new ArrayList<>(Arrays.asList(array));
        ListIterator<String> listIterator = stringList.listIterator();
        List<String> reversedList = new ArrayList<>();

        while (listIterator.hasNext()) {
            String word = listIterator.next();
            if (word.charAt(0) == 'J') {
                reversedList.add(word.substring(1));
            }
        }
        Collections.reverse(reversedList);

        for (String string : reversedList) {
            System.out.println(string);
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}
