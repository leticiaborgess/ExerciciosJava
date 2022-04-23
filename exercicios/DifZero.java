package exercicios;

import java.util.Scanner;

/*
Escreva um algoritmo para ler 2 valores 
e se o segundo valor informado for ZERO, 
deve ser lido um novo valor, ou seja, 
para o segundo valor não pode ser aceito o 
valor zero e imprimir o resultado da divisão 
do primeiro valor lido pelo segundo valor lido.
*/

public class DifZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numero1;
		double numero2;

		System.out.println("Digite o numero 1: ");
		numero1 = sc.nextDouble();

		do {
			System.out.println("Digite o numero 2: ");
			numero2 = sc.nextDouble();
			
			if(numero2 == 0) {
				System.out.println("Número incorreto! ");
			}else if (numero2 > 0) {
				System.out.println("Resultado: " + numero1/numero2);
			}

		} while (numero2 == 0);

	}
}
