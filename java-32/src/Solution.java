import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<List<Integer>> datas   = new ArrayList<>();
            List<List<Integer>> queries = new ArrayList<>();

            int datasSize = Integer.valueOf(reader.readLine());
            for (int i = datasSize; i > 0; i--) {
                datas.add(
                    Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" ")) 
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            }

            int queriesSize = Integer.valueOf(reader.readLine());
            for (int i = queriesSize; i > 0; i--) {
                queries.add(
                    Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" ")) 
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            }

            for (List<Integer> query : queries) {
                try {
                    int row = query.get(0)-1;
                    int col = query.get(1);
                    System.out.println(datas.get(row).get(col));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }

        }
    }
}
