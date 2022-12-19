import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("Digite o número de linhas de entrada: ");
			int numberOfInputLines;
			do {
				numberOfInputLines = scanner.nextInt();
			} while (isNegativeNumber(numberOfInputLines));

			List<Integer> evenValues = new ArrayList<Integer>();
			List<Integer> oddValues = new ArrayList<Integer>();

			for (int i = 1; i <= numberOfInputLines; i++) {
				System.out.println("Digite o " + i + "° valor:");
				int value = scanner.nextInt();
				boolean isNegativeNumber = isNegativeNumber(value);
				if (isNegativeNumber) {
					i--;
				} else if (value % 2 == 0) {
					evenValues.add(value);
				} else {
					oddValues.add(value);
				}
			}

			Collections.sort(evenValues);
			Collections.sort(oddValues, Collections.reverseOrder());

			for (Integer value : evenValues) {
				System.out.println(value);
			}

			for (Integer value : oddValues) {
				System.out.println(value);
			}

		} catch (Exception e) {
			System.out.println("Ocorreu um erro, verifique se você digitou um número inteiro!");
		}
	}

	private static boolean isNegativeNumber(int value) {
		if (value < 1) {
			System.out.println("O número deve ser positivo. Digite novamente:");
			return true;
		}
		return false;
	}
}