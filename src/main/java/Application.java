import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		BaseballGame game = new BaseballGame();

		boolean replay = true;
		int replayNum = 0;

		while(replay) {
			game.GameStart();
			replayNum = scanner.nextInt();
			if(replayNum == 1) {
				replay = true;
			} else if(replayNum == 2) {
				replay = false;
			}
		}


	}
}
