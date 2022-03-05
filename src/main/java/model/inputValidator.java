package model;

import java.util.HashSet;
import java.util.Set;

public class inputValidator {
    private static final int NUMBER_LENGTH_STANDARD = 3;
//    띄어쓰기 없이 받기
//    1-9까지 인지 검증

    public boolean isValidNumberLength(String numbers){
        return (numbers.length() == NUMBER_LENGTH_STANDARD);
    }

    public boolean isDuplicated(String numbers){

        String firstNumber = numbers.substring(0, 1);
        String secondNumber = numbers.substring(1, 2);
        String thirdNumber = numbers.substring(2, 3);

        Set<String> number = new HashSet<>();
        number.add(firstNumber);
        number.add(secondNumber);
        number.add(thirdNumber);

        return number.size() == NUMBER_LENGTH_STANDARD;
    }
}
