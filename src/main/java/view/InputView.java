package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요.";
    public static final String INPUT_NUMBER_ERROR_MESSAGE = "[ERROR] 잘못 입력하셨습니다.";

    private static final Scanner scanner = new Scanner(System.in);

    public static String getUserNumber() {
        System.out.println(INPUT_NUMBER_MESSAGE);

        try {
            String inputNumber = scanner.next();
            Integer.parseInt(inputNumber);
            return inputNumber;
        } catch (InputMismatchException | NumberFormatException exception) {
            System.out.println(INPUT_NUMBER_ERROR_MESSAGE);
            return getUserNumber();
        }

    }
}
