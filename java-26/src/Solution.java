import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = scanner.nextInt();
            if (counter < 1 || counter > 200) {
                throw new Exception();
            }
            scanner.nextLine();
            List<String> list = new ArrayList<>();
            for (; counter > 0; counter--) {
                list.add(scanner.nextLine());
            }
            list.stream()
                .sorted((o1, o2) -> {
                    BigDecimal d1 = new BigDecimal(o1);
                    BigDecimal d2 = new BigDecimal(o2);
                    return d2.compareTo(d1);})
                .forEach((v) -> System.out.println(v));
        }
    }
}
