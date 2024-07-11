import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = scanner.nextInt();
            if (counter < 0 || counter > 500) {
                throw new Exception();
            }
            for (; counter > 0; counter--) {
                int a = scanner.nextInt();
                if (a < 0 || a > 50) {
                    throw new Exception();
                }
                int b = scanner.nextInt();
                if (b < 0 || b > 50) {
                    throw new Exception();
                }
                int n = scanner.nextInt();
                if (n < 1 || n > 15) {
                    throw new Exception();
                }
                for (int i = 0; i < n; i++) {
                    int v = (a + (int) Math.pow(2, 0) * b);
                    for (int j = 1; j <= i; j++) {
                        v += ((int) Math.pow(2, j) * b);
                    }
                    System.out.print(String.format("%d ", v));
                }
                System.out.println();
            }
        }
    }
}
