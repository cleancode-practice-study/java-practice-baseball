import java.util.Scanner;

public class Application {

    public static final int REPLAY_GAME = 1;

    public static final int STOP_GAME = 2;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        BaseballGame game = new BaseballGame();

        int replayNum = 0;
        boolean run = true;

        while (run) {
            game.setComNum();
            game.playGame();

            replayNum = scanner.nextInt();

            if (replayNum == REPLAY_GAME) {
                run = true;
            } else if (replayNum == STOP_GAME) {
                run = false;
            }

        }

    }
}
