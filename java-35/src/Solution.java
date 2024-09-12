import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int counter = Integer.valueOf(reader.readLine());
            Map<String, String> map = new HashMap<>();
            do {
                String key      = reader.readLine();
                String value    = reader.readLine();
                map.put(key, value);
            } while (--counter > 0);
            while (reader.ready()) {
                String query = reader.readLine();
                if (map.containsKey(query)) {
                    System.out.println(String.format("%s=%s", query, map.get(query)));
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
