package exercicios;

import java.util.Scanner;

/*16) Ler 10 valores e escrever quantos desses valores lidos
 * est�o no intervalo [10,20] (incluindo os valores 10 e 20 no intervalo)
 *  e quantos deles est�o fora deste intervalo.
 */

public class Acumulacao10e20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int intervalo = 0;
		int naoIntervalo = 0;
		int numero;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Escreva o " + i + "� n�mero: ");
			numero = sc.nextInt();

			if (numero >= 10 && numero <= 20) {
				intervalo++;
			} else {
				naoIntervalo++;
			}

		}
		System.out.println("Est�o no intervalo de [10,20]: " + intervalo);
		System.out.println("Est�o fora do intervalo de [10,20]: " + naoIntervalo);
	}

}
