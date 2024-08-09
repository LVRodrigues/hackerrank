import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger valueA = new BigInteger(reader.readLine());
            BigInteger valueB = new BigInteger(reader.readLine());
            System.out.println(valueA.add(valueB));
            System.out.println(valueA.multiply(valueB));
        }
    }
}
