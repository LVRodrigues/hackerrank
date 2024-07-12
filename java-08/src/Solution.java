import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = scanner.nextInt();
            for (; counter > 0; counter--) {
                try {
                    long value = scanner.nextLong();
                    System.out.println(String.format("%d can be fitted in:", value));
                    if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                } catch (Exception e) {
                    System.out.println(String.format("%s can't be fitted anywhere.", scanner.next()));
                }
            }
        }
    }
}
