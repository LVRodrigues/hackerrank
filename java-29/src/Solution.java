import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (
            InputStreamReader stream = new InputStreamReader(System.in);
            BufferedReader reader    = new BufferedReader(stream);
        ) {
            int counter = Integer.parseInt(reader.readLine());
            Integer array[] = new Integer[counter];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(reader.readLine());
            }
            Stream.of(array).forEach(System.out::println);
        }
    }
}
