import java.util.Scanner;

public class BaseballGame {

    int player[] = new int[3];
    int comp[] = new int[3];
    int ball = 0;
    int strike = 0;
    boolean result;
    int num;

    boolean stop = true;

    Scanner scanner = new Scanner(System.in);

    public void GameStart() {

        for (int i = 0; i < comp.length; i++) {
            comp[i] = (int) ((Math.random() * 9) + 1);
            for (int j = 0; j < i; j++) {
                if (comp[i] == comp[j]) {
                    i--;
                }
            }
        }

        System.out.println("1~9의 정수를 입력해주세요.");

        while(stop) {
            for (int i = 0; i < player.length; i++) {
                num = scanner.nextInt();
                player[i] = num;
                if(num < 0 || num > 10) {
                    System.out.println("1~9의 정수를 입력해주세요.");
                }
            }

            for(int i = 0 ; i < comp.length ; i++) {
                for(int j = 0 ; j < player.length ; j++) {
                    if(comp[i] == player[j] && i == j) {
                        strike++;
                    }
                    else if(comp[i] == player[i] && i != j) {
                        ball++;
                    }
                    else if(comp[i] != player[i] && i != j) {
                        result = false;
                    }
                }
            }

            System.out.println(strike + "스트라이크 " + ball + "볼 ");

            if(result == false) {
                System.out.println("Nothing");
            }

            if(strike >= 3) {
                stop = false;
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
            }
        }

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");


    }

}
