import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            scanner.nextLine();
            List<Integer> list = new ArrayList<>();
            do {
                list.add(scanner.nextInt());
            } while (--size > 0);
            scanner.nextLine();


            int operations = scanner.nextInt();
            do {
                scanner.nextLine();
                String operation = scanner.next();
                scanner.nextLine();
                switch (operation) {
                    case "Insert": {
                            int index = scanner.nextInt();
                            int value = scanner.nextInt();
                            list.add(index, value);
                        }
                        break;
                    case "Delete": {
                            int index = scanner.nextInt();
                            list.remove(index);
                        }
                        break;
                }
            } while (--operations > 0);

            for (int v : list) {
                System.out.print(v);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
