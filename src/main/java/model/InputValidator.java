package model;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {
	private static final int NUMBER_LENGTH_STANDARD = 3;

	public static boolean isValid(String numbers) {
		return isValidNumberLength(numbers) && isNotDuplicated(numbers) && isNotZero(numbers);
	}

	private static boolean isValidNumberLength(String numbers) {
		return (numbers.length() == NUMBER_LENGTH_STANDARD);
	}

	private static boolean isNotDuplicated(String numbers) {

		String firstNumber = numbers.substring(0, 1);
		String secondNumber = numbers.substring(1, 2);
		String thirdNumber = numbers.substring(2, 3);

		Set<String> number = new HashSet<>();
		number.add(firstNumber);
		number.add(secondNumber);
		number.add(thirdNumber);

		return number.size() == NUMBER_LENGTH_STANDARD;
	}

	private static boolean isNotZero(String numbers) {
        return !numbers.contains("0");
	}
}
