import java.util.*;

public class Solution {

    private static SortedMap<Character, Integer> frequency(String text) {
        SortedMap<Character, Integer> result = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            if (result.containsKey(c)) {
                continue;
            }
            int counter = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) {
                    counter++;
                }
            }
            result.put(c, counter);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                String a = scanner.next().toLowerCase();
                String b = scanner.next().toLowerCase();
                if (a.length() < 1 || a.length() > 50) {
                    throw new Exception();
                }
                if (b.length() < 1 || b.length() > 50) {
                    throw new Exception();
                }
                if (a.length() != b.length()) {
                    throw new Exception();
                }
                SortedMap<Character, Integer> fa = frequency(a);
                SortedMap<Character, Integer> fb = frequency(b);
                for (Character c : fa.keySet()) {
                    if (!fa.get(c).equals(fb.get(c))) {
                        throw new Exception();
                    }
                }
                System.out.println("Anagrams");
            }
        } catch (Exception e) {
            System.out.println("Not Anagrams");
        }
    }
}
