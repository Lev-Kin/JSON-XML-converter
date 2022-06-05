
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine().toLowerCase();
        String word2 = scanner.nextLine().toLowerCase();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char letter : word1.toCharArray()) {
            if (map1.containsKey(letter)) {
                map1.put(letter, map1.get(letter) + 1);
            } else {
                map1.put(letter, 1);
            }
        }

        for (char letter : word2.toCharArray()) {
            if (map2.containsKey(letter)) {
                map2.put(letter, map2.get(letter) + 1);
            } else {
                map2.put(letter, 1);
            }
        }

        Set<Character> set1 = map1.keySet();
        Set<Character> set2 = map2.keySet();

        Set<Character> set = new HashSet<>(set1);
        set.addAll(set2);

        int count = 0;
        for (Character letter : set) {
            int x = map1.getOrDefault(letter, 0);
            int y = map2.getOrDefault(letter, 0);
            count += x > y ? x - y : y - x;
        }

        System.out.println(count);

    }

}
