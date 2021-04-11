import java.util.Scanner;

public class Application {
    public static final int REPLAY = 1;
    public static final int CLOSE = 2;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        BaseballGame baseballgame = new BaseballGame();

        int game;
        boolean run = true;

        while (run) {
            baseballgame.start();

            game = scanner.nextInt();

            if (game == REPLAY) {
                run = true;
            } else if (game == CLOSE) {
                run = false;
            }
        }
    }
}
