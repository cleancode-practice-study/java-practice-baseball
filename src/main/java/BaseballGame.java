import java.util.Scanner;

public class BaseballGame {

    private static final int STRIKE_NUM = 3;
    private static final int NUM_LENGTH = 3;

    private boolean gameRun = true;

    Scanner scanner = new Scanner(System.in);

    public int[] setComNum() {
        int targetNum[] = new int[NUM_LENGTH];
        for (int i = 0; i < targetNum.length; i++) {
            targetNum[i] = (int) ((Math.random() * 9) + 1);
            for (int j = 0; j < i; j++) {//중복되는 숫자 나올시 다시 뽑기
                if (targetNum[i] == targetNum[j]) {
                    i--;
                }
            }
        }
        return targetNum;
    }

    public int[] getUserNum() {
        int getInput = 0;
        getInput = Integer.parseInt(scanner.nextLine()); //값 받기

        int player[] = new int[NUM_LENGTH];

        player[0] = getInput / 100; //첫 번째 숫자 넣기
        getInput = getInput % 100;
        player[1] = getInput / 10;  //두 번째 숫자 넣기
        player[2] = getInput % 10;  //세 번째 숫자 넣기

        return player;
    }

    public int countBall(int[] targetNum, int[] player) {
        int ball = 0;
        for (int i = 0; i < targetNum.length; i++) {
            for (int j = 0; j < player.length; j++) {
                if (targetNum[i] == player[j] && i != j) {
                    ball++;
                }
            }
        }
        return ball;
    }

    public int countStrike(int[] targetNum, int[] player ) {
        int strike = 0;
        for (int i = 0; i < targetNum.length; i++) {
            for (int j = 0; j < player.length; j++) {
                if (targetNum[i] == player[j] && i == j) {
                    strike++;
                }
            }
        }
        return strike;
    }

    public void showResult(int ball, int strike) {
        if (strike > 0 && ball > 0) {
            System.out.println(strike + "스트라이크 " + ball + "볼 ");
        } else if (strike > 0 && ball == 0) {
            System.out.println(strike + "스트라이크");
        } else if (strike == 0 && ball > 0) {
            System.out.println(ball + "볼");
        } else if (strike == 0 && ball == 0) {
            System.out.println("Nothing");
        }

        if (strike >= STRIKE_NUM) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
            gameRun = false;
        }
    }

    public void playGame() {
        int[] targetNum;
        int[] userNum;

        targetNum = setComNum();

        System.out.print("숫자를 입력해주세요 : ");

        while (gameRun) {
            int ball = 0;
            int strike = 0;

            userNum = getUserNum();

            ball = countBall(targetNum, userNum);

            strike = countStrike(targetNum, userNum);

            showResult(ball, strike);
        }

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        gameRun = true;

    }

}
