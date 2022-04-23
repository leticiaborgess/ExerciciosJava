package exercicios;

import java.util.Scanner;

/* Ler um valor e escrever se é positivo ou negativo 
 * (considere o valor zero como positivo)*/

public class IfElsePosNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!");
		}

	}

}
