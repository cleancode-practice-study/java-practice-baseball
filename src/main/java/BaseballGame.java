import java.util.Scanner;

public class BaseballGame {

    int player[] = new int[3];
    int com[] = new int[3];
    int ball = 0;
    int strike = 0;
    boolean result;
    int num;

    boolean stop = true;

    Scanner scanner = new Scanner(System.in);

    public void setComNum() {
        for (int i = 0; i < com.length; i++) {
            com[i] = (int) ((Math.random() * 9) + 1);
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                }
            }
        }
    }

    public void playGame() {

        System.out.println("숫자를 입력해주세요.");

        while(stop) {
            num = Integer.parseInt(scanner.nextLine());

            player[0] = num/100;
            num = num%100;
            player[1] = num/10;
            player[2] = num%10;

            for(int i = 0 ; i < com.length ; i++) {
                for(int j = 0 ; j < player.length ; j++) {
                    if(com[i] == player[j] && i == j) {
                        strike++;
                    }
                    else if(com[i] == player[i] && i != j) {
                        ball++;
                    }
                }
            }

            if(strike > 0 || ball > 0) {
                System.out.println(strike + "스트라이크 " + ball + "볼 ");
            } else if(strike == 0 && ball ==0) {
                System.out.println("Nothing");
            }


            if(strike >= 3) {
                stop = false;
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
            }

            strike = 0;
            ball = 0;
        }

        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");


    }

}
