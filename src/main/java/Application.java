import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		Game g = new Game();
		boolean run = true;

		while (run) {
			g.Start();

			int replayGame = scanner.nextInt();
			if (replayGame == 1) {
				run = true;
			} else if (replayGame == 2) {
				run = false;
			}
		}
	}
}
