import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		BaseballGame game = new BaseballGame();

		boolean run = true;
		int replayNum = 0;

		while(run) {
			game.setComNum();
			game.playGame();

			replayNum = scanner.nextInt();

			if(replayNum == 1) {
				run = true;
			} else if(replayNum == 2) break;
		}


	}
}
