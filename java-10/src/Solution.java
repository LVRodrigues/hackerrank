import java.util.Scanner;

public class Solution {

    private static int B;
    private static int H;
    private static String result;

    static {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                B = scanner.nextInt();
                H = scanner.nextInt();
                if (B <= 0 || H <= 0) {
                    throw new Exception("Breadth and height must be positive");
                }
                result = ""+(B*H);
            } catch (Exception e) {
                result = String.format("%s", e);
            }
        } 
    }

    public static void main(String[] args) throws Exception {
        System.out.println(result);
    }
}
