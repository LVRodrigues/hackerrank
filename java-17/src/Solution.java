import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.next();
            String reverse = "";

            if (text.length() > 50) {
                throw new Exception();
            }

            for (int i = text.length()-1; i >= 0; i--) {
                reverse += text.charAt(i);
            }

            System.out.println(text.equals(reverse)?"Yes":"No");            
        }
    }
}
