package model;

public class GameResult {
	private int ballCount;
	private int strikeCount;

	public GameResult(int ballCount, int strikeCount) {
		this.ballCount = ballCount;
		this.strikeCount = strikeCount;
	}

	public int getBallCount() {
		return ballCount;
	}

	public int getStrikeCount() {
		return strikeCount;
	}
}
