import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {

			int k;
			int n;

			System.out.println("Digite o tamanho do array:");
			n = scanner.nextInt();

			System.out.println("Digite o valor alvo:");
			k = scanner.nextInt();

			List<Integer> wholeNumbers = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				System.out.println("Digite o número " + i + " do array:");
				int number = scanner.nextInt();
				while (number <= 0) {
					System.out.println("O número deve ser positivo. Digite novamente:");
					number = scanner.nextInt();
				}
				wholeNumbers.add(number);
			}

			int pairs = 0;
			for (int i = 0; i < wholeNumbers.size(); i++) {
				for (int j = 0; j < wholeNumbers.size(); j++) {
					if (wholeNumbers.get(i) - wholeNumbers.get(j) == k) {
						pairs++;
					}
				}
			}

			System.out.println("O número de pares que satisfazem o critério é " + pairs);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro, verifique se você digitou um número inteiro!");
		}
	}
}