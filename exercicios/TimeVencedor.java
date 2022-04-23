package exercicios;

/*Ler o nome de 2 times e o número de gols marcados na partida (para cada time).
 * Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa 
 * a palavra EMPATE.
 */

import java.util.Scanner;

public class TimeVencedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String time1;
		String time2;
		int golsTime1;
		int golsTime2;

		System.out.println("Nome do time 1: ");
		time1 = sc.nextLine();

		System.out.println("Nome do time 2: ");
		time2 = sc.nextLine();

		System.out.println("Gols marcados pelo time 1: ");
		golsTime1 = sc.nextInt();

		System.out.println("Gols marcados pelo time 2: ");
		golsTime2 = sc.nextInt();

		if (golsTime1 > golsTime2) {
			System.out.println("Vencedor: " + time1);

		} else {
			if (golsTime2 > golsTime1) {
				System.out.println("Vencedor: " + time2);
			} else {
				if (golsTime1 == golsTime2) {
					System.out.println("Empate!");
				}
			}

		}

		sc.close();
	}
}
