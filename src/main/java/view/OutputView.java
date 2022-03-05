package view;

import model.GameResult;

public class OutputView {
	public static void printResult(GameResult gameResult) {
		System.out.println("볼 수 : " + gameResult.getBallCount());
		System.out.println("스트라이크 수 : " + gameResult.getStrikeCount());
	}
}
