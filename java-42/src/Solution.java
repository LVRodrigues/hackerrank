import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int bitsize = scanner.nextInt();
            int counter = scanner.nextInt();
            
            BitSet b1 = new BitSet(bitsize);
            BitSet b2 = new BitSet(bitsize);
            do {
                scanner.nextLine();
                String operation    = scanner.next();
                int a               = scanner.nextInt();
                int b               = scanner.nextInt();
                switch (operation) {
                    case "AND":
                        if (a == 1) {
                            b1.and(b2);
                        } else {
                            b2.and(b1);
                        }
                        break;
                    case "OR":
                        if (a == 1) {
                            b1.or(b2);
                        } else {
                            b2.or(b1);
                        }
                        break;
                    case "XOR":
                        if (a == 1) {
                            b1.xor(b2);
                        } else {
                            b2.xor(b1);
                        }
                        break;
                    case "FLIP":
                        if (a == 1) {
                            b1.flip(b);
                        } else {
                            b2.flip(b);
                        }
                        break;
                    case "SET":
                        if (a == 1) {
                            b1.set(b);
                        } else {
                            b2.set(b);
                        }
                        break;
                }
                System.out.println(String.format("%d %d", b1.cardinality(), b2.cardinality()));
            } while (--counter > 0);
        }
    }
}