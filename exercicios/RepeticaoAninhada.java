package exercicios;

/*17) Escreva um algoritmo que imprima as seguintes seq��ncias de n�meros: 
 * (1, 1 2 3 4 5 6 7 8 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) 
 * (4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente, 
 * at� que o primeiro n�mero (antes da v�rgula), tamb�m chegue a 10.
 */

public class RepeticaoAninhada {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(" " + (i) + ", ");

			for (int j = 1; j <= 10; j++)
				System.out.print(j + " ");
		}

	}

}
