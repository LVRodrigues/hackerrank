import java.text.NumberFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            double value = scanner.nextDouble();

            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println(String.format("US: %s", us.format(value)));

            // I consider this corret with Java 15
            // System.out.println(String.format("India: %s", in.format(value)));
            // On Hackerrank using Java 8
            System.out.println(String.format("India: %s", in.format(value).replaceAll(in.getCurrency().getSymbol(), "Rs.")));

            System.out.println(String.format("China: %s", ch.format(value)));
            System.out.println(String.format("France: %s", fr.format(value)));
        }
    }
}
