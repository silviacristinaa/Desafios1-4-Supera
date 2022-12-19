import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {

			System.out.println("Digite o tamanho do array:");
			int numberTestCases = scanner.nextInt();
			scanner.nextLine();

			List<String> decipheredPhrases = new ArrayList<>();
			for (int i = 1; i <= numberTestCases; i++) {
				System.out.println("Digite a " + i + "° frase:");

				String phrase = scanner.nextLine().toUpperCase();
				while (phrase.length() < 2 || phrase.length() > 100) {
					System.out.println("A frase deve conter no minímo 2 caracteres e no máximo 100. Digite novamente:");
					phrase = scanner.nextLine().toUpperCase();
				}

				String firstPartPhase = phrase.substring(0, phrase.length() / 2);
				String secondPartPhase = phrase.substring(phrase.length() / 2, phrase.length());

				decipheredPhrases.add(new StringBuilder(firstPartPhase).reverse().toString()
						+ new StringBuilder(secondPartPhase).reverse().toString());
			}
			
			for (String phrase : decipheredPhrases) {
				System.out.println(phrase);
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro, verifique se você digitou um número inteiro!");
		}
	}
}
