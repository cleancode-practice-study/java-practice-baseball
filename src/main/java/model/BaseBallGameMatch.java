package model;

import java.util.List;

public class BaseBallGameMatch {

	public GameResult match(List<String> userNumbers, List<String> randomNumbers) { // 325
		int ballCount = countBall(userNumbers, randomNumbers);
		int strikeCount = countStrike(userNumbers, randomNumbers);

		return new GameResult(ballCount, strikeCount);
	}

	private int countBall(List<String> userNumbers, List<String> randomNumbers) {
		// 볼 개수 구하기


	}

	private int countStrike(List<String> userNumbers, List<String> randomNumbers) {
		// 스트라이크 개수 구하기

	}

}
