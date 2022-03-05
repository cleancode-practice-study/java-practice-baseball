package controller;

import model.BaseBallGameMatch;
import model.GameResult;
import model.InputValidator;
import model.RandomNumberCreator;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Controller {
    public void run() {
        String userInput = getUserInput();
        List<String> userNumbers = convert(userInput);

        BaseBallGameMatch baseBallGameMatch = new BaseBallGameMatch();
        List<String> randomNumbers = RandomNumberCreator.create();
        GameResult gameResult = baseBallGameMatch.match(userNumbers, randomNumbers);

        OutputView.printResult(gameResult);


    }

    private List<String> convert(String userInput) {
        // 자르기

    }

    // inputview에서 숫자 입력 받아서 모델에 넘기자
    public static String getUserInput() {
        boolean valid;
        String inputNumber;

        do {
            inputNumber = InputView.getUserNumber();
            valid = InputValidator.isValid(inputNumber);
        } while (!valid);

        return inputNumber;

    }


    // 계산 결과 outputview에 띄우자
}
