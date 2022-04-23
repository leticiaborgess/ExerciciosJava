package exercicios;

import java.util.Scanner;

public class Eleicao {
	/*
	 * Escreva um algoritmo para ler o número total de eleitores de um município, o
	 * número de votos brancos, nulos e válidos. Calcular e escrever o percentual
	 * que cada um representa em relação ao total de eleitores com duas casas
	 * decimais.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int eleitores;
		int brancos;
		int nulos;
		int validos;
		

		System.out.println("Quantos eleitores tem na sua cidade? ");
		eleitores = sc.nextInt();

		System.out.println("Votos Brancos: ");
		brancos = sc.nextInt();

		System.out.println("Votos Nulos: ");
		nulos = sc.nextInt();

		System.out.println("Votos Válidos: ");
		validos = sc.nextInt();

		double pBrancos;
		double pNulos;
		double pValidos;
		
		pBrancos = (brancos * 100.0)/eleitores;
		pNulos = (nulos * 100.0)/eleitores;
		pValidos = (validos * 100.0)/eleitores;
		
		System.out.printf("Percentual de votos em branco: %.2f %s", pBrancos , "%\n");
		System.out.printf("Percentual de votos nulos: %.2f %s", pNulos , "%\n");
		System.out.printf("Percentual de votos válidos: %.2f %s", pValidos , "%");
		
		

		sc.close();

	}

}
