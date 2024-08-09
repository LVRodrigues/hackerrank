import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (
            InputStreamReader stream    = new InputStreamReader(System.in);
            BufferedReader reader       = new BufferedReader(stream);
        ) {
            String line = reader.readLine();
            BigInteger value = new BigInteger(line);
            if (value.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
