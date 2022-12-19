import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			scanner.useLocale(Locale.US);

			System.out.println("Digite o valor monetário: ");
			Double monetaryValue;
			do {
				monetaryValue = scanner.nextDouble();
			} while (isNegativeNumber(monetaryValue));
			
			int quotient, rest, note, coin;

			rest = (int) (monetaryValue * 100.00 + 0.5);

			System.out.println("NOTAS:");

			note = 100;
			quotient = rest / (note * 100);
			System.out.println(quotient + " nota(s) de R$ " + note + ".00");
			rest = rest % (note * 100);

			note = 50;
			quotient = rest / (note * 100);
			System.out.println(quotient + " nota(s) de R$ " + note + ".00");
			rest = rest % (note * 100);

			note = 20;
			quotient = rest / (note * 100);
			System.out.println(quotient + " nota(s) de R$ " + note + ".00");
			rest = rest % (note * 100);

			note = 10;
			quotient = rest / (note * 100);
			System.out.println(quotient + " nota(s) de R$ " + note + ".00");
			rest = rest % (note * 100);

			note = 5;
			quotient = rest / (note * 100);
			System.out.println(quotient + " nota(s) de R$ " + note + ".00");
			rest = rest % (note * 100);

			note = 2;
			quotient = rest / (note * 100);
			System.out.println(quotient + " nota(s) de R$ " + note + ".00");
			rest = rest % (note * 100);

			System.out.println("MOEDAS:");

			coin = 100;
			quotient = rest / coin;
			System.out.println(quotient + " moeda(s) de R$ 1.00");
			rest = rest % coin;

			coin = 50;
			quotient = rest / coin;
			System.out.println(quotient + " moeda(s) de R$ 0.50");
			rest = rest % coin;

			coin = 25;
			quotient = rest / coin;
			System.out.println(quotient + " moeda(s) de R$ 0.25");
			rest = rest % coin;

			coin = 10;
			quotient = rest / coin;
			System.out.println(quotient + " moeda(s) de R$ 0.10");
			rest = rest % coin;

			coin = 5;
			quotient = rest / coin;
			System.out.println(quotient + " moeda(s) de R$ 0.05");
			rest = rest % coin;

			System.out.println(rest + " moeda(s) de R$ 0.01");

		} catch (Exception e) {
			System.out.println("Ocorreu um erro, verifique se você digitou um valor numérico!");
		}
	}
	private static boolean isNegativeNumber(Double monetaryValue) {
		if (monetaryValue < 1) {
			System.out.println("O valor deve ser positivo. Digite novamente:");
			return true;
		}
		return false;
	}
}