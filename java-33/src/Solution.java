import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int games = scanner.nextInt();
            for (int i = games; i > 0; i--) {
                scanner.nextLine();
                int size    = scanner.nextInt();
                int leap    = scanner.nextInt();
                int[] game  = new int[size];
                scanner.nextLine();
                for (int j = 0; j < size; j++) {
                    game[j] = scanner.nextInt();
                }
                play(leap, game);
            }
        }
    }

    private static void play(int leap, int[] game) {
        System.out.println(solve(leap, game, 0)?"YES":"NO");
    }

    private static boolean solve(int leap, int[] game, int index) {
        if (index >= game.length) {
            return true;
        }
        if (index < 0 || game[index] == 1) {
            return false;
        }
        game[index] = 1;
        return  solve(leap, game, index+leap) ||
                solve(leap, game, index+1) ||
                solve(leap, game, index-1);
    }
}
