import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = scanner.nextInt();
            int size    = scanner.nextInt();
            scanner.nextLine();

            Deque<Integer> deque    = new LinkedList<>();
            int uniques             = 0;
            Set<Integer> set        = new HashSet<>();
            do {
                int value = scanner.nextInt();
                deque.add(value);
                set.add(value);

                if (deque.size() == size) {
                    if (set.size() > uniques) {
                        uniques = set.size();
                    }
                    int removing = deque.pop();
                    if (!deque.contains(removing)) {
                        set.remove(removing);                        
                    }
                }
            } while (--counter > 0);
            System.out.println(uniques);
        }
    }
}
