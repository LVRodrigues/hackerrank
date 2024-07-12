import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String A = scanner.next();
            String B = scanner.next();

            System.out.println(A.length() + B.length());
            System.out.println(A.compareTo(B)>0?"Yes":"No");

            Pattern pattern = Pattern.compile("^.");
            System.out.printf("%s %s\n", 
                pattern.matcher(A).replaceFirst(m -> m.group().toUpperCase()), 
                pattern.matcher(B).replaceFirst(m -> m.group().toUpperCase()));
        }
    }
}
