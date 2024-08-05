import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static final Pattern pattern = Pattern.compile("^[A-Z,a-z][A-Z,a-z,0-9,_]{7,29}");

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = scanner.nextInt();
            if (counter < 1 || counter > 100) {
                throw new Exception();
            }
            scanner.nextLine();
            for (;counter > 0; counter--) {
                String username = scanner.nextLine();
                Matcher matcher = pattern.matcher(username);
                if (matcher.matches()) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }
}