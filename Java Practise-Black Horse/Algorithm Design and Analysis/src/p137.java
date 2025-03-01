import java.util.ArrayList;
import java.util.List;

public class p137 {
	public static void main(String[] args) {
		List<String> results = findExpressions();
		for (String result : results) {
			System.out.println(result);
		}
	}

	public static List<String> findExpressions() {
		List<String> results = new ArrayList<>();
		String digits = "123456789";
		findExpressionsHelper(digits, 0, "", 0, 0, results);
		return results;
	}

	private static void findExpressionsHelper(String digits, int index, String expression, long currentSum, long lastOperand, List<String> results) {
		if (index == digits.length()) {
			if (currentSum == 100) {
				results.add(expression);
			}
			return;
		}

		for (int i = index; i < digits.length(); i++) {
			String currentNumberStr = digits.substring(index, i + 1);
			long currentNumber = Long.parseLong(currentNumberStr);

			// Case 1: Add '+' operator
			if (index == 0) {
				findExpressionsHelper(digits, i + 1, currentNumberStr, currentNumber,
						currentNumber, results);
			} else {
				findExpressionsHelper(digits, i + 1, expression + "+" + currentNumberStr,
						currentSum + currentNumber, currentNumber, results);

				// Case 2: Add '-' operator
				findExpressionsHelper(digits, i + 1, expression + "-" + currentNumberStr,
						currentSum - currentNumber, -currentNumber, results);
			}

			// Case 3: Concatenate numbers (no operator)
			if (index != 0) {
				long concatenatedNumber = lastOperand >= 0 ? (lastOperand * 10 + currentNumber) :
						(lastOperand * 10 - currentNumber);
				findExpressionsHelper(digits, i + 1, expression + currentNumberStr,
						currentSum - lastOperand + concatenatedNumber, concatenatedNumber, results);
			}
		}
	}
}
