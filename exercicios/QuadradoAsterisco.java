package exercicios;

import java.util.Scanner;

/*
18) Leia dois números inteiros. A partir desses valores desenhe 
um quadrado de asteriscos que tenha as dimensões dos valores lidos.
*/

public class QuadradoAsterisco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int base;
		int altura;

		System.out.println("Base: ");
		base = sc.nextInt();

		System.out.println("Altura: ");
		altura = sc.nextInt();

		for (int i = 1; i <= base; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
		for (int j = 1; j <= altura - 2; j++) {
			System.out.println("*" + (" ".repeat(base - 2)) + "*");
		}
		for (int k = 1; k <= base; k++) {
			System.out.print("*");

		}
	}
}
