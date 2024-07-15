import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            List<String> tokens = new ArrayList<>();
            for (String token : line.split("[ !,?._'@]")) {
                if (!token.isBlank()) {
                    tokens.add(token);
                }
            }
            System.out.println(tokens.size());
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
