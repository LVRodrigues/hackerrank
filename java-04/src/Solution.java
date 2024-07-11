import java.util.Scanner;

public class Solution {
   
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();  // Consume the remaining newline
        String stringValue = scanner.nextLine();

        // Printing the outputs
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
        
        scanner.close();
    }
}
