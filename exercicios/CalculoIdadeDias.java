package exercicios;

import java.util.Scanner;

public class CalculoIdadeDias {
	/*Faça um algoritmo que leia a idade de uma pessoa 
	 * expressa em anos, meses e dias e escreva a idade 
	 * dessa pessoa expressa apenas em dias. 
	 * Considerar ano com 365 dias e mês com 30 dias.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anos;
		int meses;
		int dias;
		
		System.out.println("Idade em anos: ");
		anos = sc.nextInt();
		
		System.out.println("Idade em meses: ");
		meses = sc.nextInt();
		
		System.out.println("Idade em dias: ");
		dias = sc.nextInt();
		
		int total_idade = dias + (meses * 30) + (anos * 365);
		
		System.out.println("Idade total em dias: " + total_idade);
		
		

	}

}
