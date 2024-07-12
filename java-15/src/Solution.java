import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.next();
            int start   = scanner.nextInt();
            int finish  = scanner.nextInt();

            if (text.isEmpty() || text.length() > 100) {
                throw new Exception();
            }
            if (start < 0 || start >= finish) {
                throw new Exception();
            }
            if (finish <= start || finish > text.length()) {
                throw new Exception();
            }
            System.out.println(text.substring(start, finish));
        }
    }
}
