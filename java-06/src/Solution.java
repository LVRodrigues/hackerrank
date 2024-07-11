import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        if (N < 2 || N > 20) {
            return;
        }
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N*i));
        }
    }
}
