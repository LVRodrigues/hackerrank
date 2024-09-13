import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int counter = Integer.parseInt(reader.readLine());
            Set<String> set = new HashSet<>();
            do {
                String line = reader.readLine();
                set.add(line);
                System.out.println(set.size());
            } while (--counter > 0);
        }
    }
}
