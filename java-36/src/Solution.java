import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Solution {

    private static final Character[] INPUTS = {'(', '[', '{'};
    private static final Character[] OUTPUTS = {')', ']', '}'};
    private static final int NOTFOUND = -1;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (reader.ready()) {
                String line             = reader.readLine();
                Stack<Character> stack  = new Stack<>();
                for (Character chr : line.toCharArray()) {
                    if (Arrays.binarySearch(INPUTS, chr) > NOTFOUND) {
                        stack.push(chr);
                    } else if (Arrays.binarySearch(OUTPUTS, chr) > NOTFOUND) {
                        if (stack.empty()) {
                            stack.push('0');
                            break;
                        }
                        Character pair = stack.peek();
                        if (chr == ')' && pair != '(') {
                            break;                            
                        }
                        if (chr == ']' && pair != '[') {
                            break;                            
                        }
                        if (chr == '}' && pair != '{') {
                            break;                            
                        }
                        stack.pop();
                    }
                }
                System.out.println(stack.empty());
            }
        }
    }
}
