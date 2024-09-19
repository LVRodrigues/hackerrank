import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            MessageDigest digester = MessageDigest.getInstance("MD5");
            while (reader.ready()) {
                String line = reader.readLine();
                digester.reset();
                digester.update(line.getBytes());
                byte[] hash = digester.digest();
                for (byte b : hash) {
                    String aux = Integer.toHexString(0xFF & b);
                    if (aux.length() == 1) {
                        System.out.print("0");
                    }
                    System.out.print(aux);
                }
                System.out.println();
            }
        }
    }
}
