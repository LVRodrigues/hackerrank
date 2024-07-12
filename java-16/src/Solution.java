import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.next();
            int k       = scanner.nextInt();

            SortedSet<String> set = new TreeSet<>();
            for (int i = 0; i < text.length()-k+1; i++) {
                set.add(text.substring(i, k+i));
            }
            System.out.println(set.first());
            System.out.println(set.last());
        }
    }
}
