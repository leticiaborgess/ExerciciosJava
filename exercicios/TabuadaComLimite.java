package exercicios;

import java.util.Scanner;

/*14) Ler um n�mero inteiro (aceitar somente valores entre 1 e 100) 
 * e escrever a tabuada desse n�mero indo de 0 at� um n�mero limite lido do teclado.
 */

public class TabuadaComLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroBase;
		int numeroLimite;

		System.out.println("N�mero base: ");
		numeroBase = sc.nextInt();

		if (numeroBase > 100) {
			System.out.println("Digite um n�mero menor que 100!");

		} else {
			System.out.println("N�mero limite: ");
			numeroLimite = sc.nextInt();

			for (int i = 0; i <= numeroLimite; i++) {
				System.out.println(numeroBase + " x " + i + " = " + numeroBase * i);
			}

		}
	}
}