import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    private final static Pattern pattern = Pattern.compile("<(.+)>([^<>]+)</\\1>");

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer counter = scanner.nextInt();
            if (counter < 1 || counter > 100) {
                throw new Exception();
            }
            scanner.nextLine();
            for (; counter > 0; counter--) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                boolean founded = false;
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                    founded = true;
                }
                if (!founded) {
                    System.out.println("None");
                }
            }
        }
    }
}
