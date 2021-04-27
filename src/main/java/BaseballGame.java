//import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaseballGame {

    public static final int STRIKE_NUM = 3;
    public static final int NUM_LENGTH = 3;

    private int ball;
    private int strike;
    private int getInput = 0;

    private int player[] = new int[NUM_LENGTH];
    private int targetNum[] = new int[NUM_LENGTH];

    private boolean gameRun = true;

    Scanner scanner = new Scanner(System.in);

    public void setComNum() {
        for (int i = 0; i < targetNum.length; i++) {
            targetNum[i] = (int) ((Math.random() * 9) + 1);
            for (int j = 0; j < i; j++) {//중복되는 숫자 나올시 다시 뽑기
                if (targetNum[i] == targetNum[j]) {
                    i--;
                }
            }
        }
    }

    public void countResult() {
        for (int i = 0; i < targetNum.length; i++) {
            for (int j = 0; j < player.length; j++) {
                if (targetNum[i] == player[j] && i == j) {
                    strike++;
                } else if (targetNum[i] == player[j] && i != j) {
                    ball++;
                }
            }
        }
    }

    public void showResult() {
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

        System.out.print("숫자를 입력해주세요 : ");

        while (gameRun) {

            ball = 0;
            strike = 0;

            getInput = Integer.parseInt(scanner.nextLine()); //값 받기

            player[0] = getInput / 100; //첫 번째 숫자 넣기
            getInput = getInput % 100;
            player[1] = getInput / 10;  //두 번째 숫자 넣기
            player[2] = getInput % 10;  //세 번째 숫자 넣기

            countResult();

            showResult();

        }

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        gameRun = true;

    }

}
