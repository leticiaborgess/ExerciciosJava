package exercicios;

import java.util.Scanner;

/*14) Ler um número inteiro (aceitar somente valores entre 1 e 100) 
 * e escrever a tabuada desse número indo de 0 até um número limite lido do teclado.
 */

public class TabuadaComLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroBase;
		int numeroLimite;

		System.out.println("Número base: ");
		numeroBase = sc.nextInt();

		if (numeroBase > 100) {
			System.out.println("Digite um número menor que 100!");

		} else {
			System.out.println("Número limite: ");
			numeroLimite = sc.nextInt();

			for (int i = 0; i <= numeroLimite; i++) {
				System.out.println(numeroBase + " x " + i + " = " + numeroBase * i);
			}

		}
	}
}