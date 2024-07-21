import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner =new Scanner(System.in)) {
            int counter = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < counter; i++) {
                String test = scanner.nextLine();
                try {
                    Pattern.compile(test);
                    System.out.println("Valid");
                } catch (PatternSyntaxException ex) {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
