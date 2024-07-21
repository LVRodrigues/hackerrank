import java.util.*;
import java.util.regex.*;

public class Solution {

    private static final Pattern pattern = Pattern.compile("(\\d{1,3}.){3}\\d{1,3}");

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String ip = scanner.nextLine();
                Matcher matcher = pattern.matcher(ip);
                try {
                    if (matcher.matches()) {
                        String[] octals = ip.split("\\.");
                        for (int i = 0; i < octals.length; i++) {
                            int value = Integer.valueOf(octals[i]);
                            if (value < 0 || value > 255) {
                                throw new RuntimeException();
                            }
                        }
                        System.out.println(true);
                    } else {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException e) {
                    System.out.println(false);
                }
            }
        }
    }
}
