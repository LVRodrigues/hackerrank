import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            var counter = 1;
            while (scanner.hasNextLine()) {
                System.out.println(String.format("%d %s", counter++, scanner.nextLine()));
            }
        }
    }
}
