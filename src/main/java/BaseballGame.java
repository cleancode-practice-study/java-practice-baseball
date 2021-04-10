import com.sun.tools.javac.util.StringUtils;

import java.util.Scanner;

public class BaseballGame {
    public static final int NUMBER_PLAYER = 3;

    final Scanner scanner = new Scanner(System.in);

    private String guessNum = "";

    int computer[] = new int[3];
    int player[] = new int[3];

    private int strike = 0;
    private int ball = 0;

    public void guessNumber() {
        guessNum = scanner.next();

        int stringNumber = guessNum.length();

        if (stringNumber != NUMBER_PLAYER) {
            System.out.println("1부터 9까지의 정수 3자리를 입력해주세요.");
            guessNum = scanner.next();
        }

        String[] changeArray = guessNum.split("");

        for (int i = 0; i < player.length; i++) {
            player[i] = Integer.parseInt(changeArray[i]);
        }
    }

    public void gameResult() {
        strike = 0;
        ball = 0;

        for (int i = 0; i < computer.length; i++) {
            for (int j = 0; j < player.length; j++) {
                compare(i, j);
            }
        }

        if (strike > 0 && ball > 0)
            System.out.println(ball + "볼" + strike + "스트라이크\n");
        else if (strike == 0 && ball > 0)
            System.out.println(ball + "볼");
        else if (strike > 0 && ball == 0)
            System.out.println(strike + "스트라이크");
        else if (strike == 0 && ball == 0)
            System.out.println("Nothing");
    }

    public void compare(int i, int j) {
        if (computer[i] == player[j] && i == j)
            strike++;
        else if (computer[i] == player[j] && i != j)
            ball++;
    }

    /* public void overLab(int i, int j) {
        if (computer[i] == computer[j]) {
            computer[i] = (int) (Math.random() * 9) + 1;
        }
        j--;
    }
    */

    public void start() {
        /*
        int i = 0;
        int j = 0;

        for (i = 0; i < computer.length; i++) {
            computer[i] = (int) (Math.random() * 9) + 1;
            j = i - 1;
            while (j > 0) {
                overLab(i, j);
            }
        }
        */

        for (int i = 0; i < computer.length; i++) {
            computer[i] = (int) (Math.random() * 9) + 1;
        }

        do {
            System.out.println("숫자를 입력해주세요 : ");
            guessNumber();
            gameResult();
        } while (strike != NUMBER_PLAYER);

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
