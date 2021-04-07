import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    int Cmp[] = new int[3];
    int Player[] = new int[3];
    String guessNum = "";
    int strike = 0;
    int ball = 0;

    public void PlayerGNum() {
        guessNum = scanner.next(); // String 으로 숫자 입력 받은 뒤
        String[] array = guessNum.split(""); // string 배열로 변환

        for(int i = 0; i<Player.length; i++){
            Player[i] = Integer.parseInt(array[i]); // string 배열을 int 배열로 변환
        }
    }

    public void Result() {
        strike = 0;
        ball = 0;

        for (int i = 0; i < Cmp.length; i++) {
            for (int j = 0; j < Player.length; j++) {
                if (Cmp[i] == Player[j] && i == j) {
                    strike++;
                } else if (Cmp[i] == Player[j] && i != j) {
                    ball++;
                }
            }
        }

        if (strike > 0 && ball > 0)
            System.out.println(ball + "볼" + strike + "스트라이크\n");
        else if(strike == 0 && ball > 0)
            System.out.println(ball + "볼");
        else if(strike > 0 && ball == 0)
            System.out.println(strike + "스트라이크");
        else if (strike == 0 && ball == 0)
            System.out.println("Nothing");
    }

    public void Start() {
        for (int i = 0; i < Cmp.length; i++) {
            Cmp[i] = (int) (Math.random() * 9) + 1;
        }

        System.out.println("1부터 9까지의 정수를 입력해주세요.");

            do {
                System.out.println("숫자를 입력해주세요 : ");
                PlayerGNum();
                Result();
            }while (strike != 3);

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        }
}