import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    private static final int LIMIT = 6;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<List<Integer>> array = new ArrayList<>();
            for (int i = 0; i < LIMIT; i++) {
                array.add(
                    Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            }

            int hourglass = Integer.MIN_VALUE;
            for (int row = 0; row < LIMIT; row++) {
                for (int column = 0; column < LIMIT; column++) {
                    try {
                        int value = 0;
                        value += array.get(row).get(column);
                        value += array.get(row).get(column+1);
                        value += array.get(row).get(column+2);
                        value += array.get(row+1).get(column+1);
                        value += array.get(row+2).get(column);
                        value += array.get(row+2).get(column+1);
                        value += array.get(row+2).get(column+2);
                        if (value > hourglass) {
                            hourglass = value;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
            }

            System.out.println(hourglass);
        }
    }
}
