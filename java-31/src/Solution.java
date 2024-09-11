import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            scanner.nextLine();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }

            List<int[]> subs = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                subs.addAll(extract(i+1, array));
            }

            int count = 0;
            for (int[] sub: subs) {
                int value = sum(sub);
                if (value < 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static int sum(int[] sub) {
        int result  = 0;
        for (int value : sub) {
            result += value;
        }
        return result;
    }

    private static Collection<? extends int[]> extract(int size, int[] array) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i + size > array.length) {
                break;
            }
            int[] sub = new int[size];
            for (int j = 0; j < size; j++) {
                sub[j] = array[i+j];
            }
            result.add(sub);
        }
        return result;
    }
}
