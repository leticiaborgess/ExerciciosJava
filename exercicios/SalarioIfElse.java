package exercicios;
/*A jornada de trabalho semanal de um funcion�rio � de 40 horas. 
 * O funcion�rio que trabalhar mais de 40 horas receber� hora extra, 
 * cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. 
 * Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s,
 * o sal�rio por hora e escreva o sal�rio total do funcion�rio, 
 * que dever� ser acrescido das horas extras, caso tenham sido trabalhadas
 * (considere que o m�s possua 4 semanas exatas)
 * */

import java.util.Scanner;

public class SalarioIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas;
		double salarioHora;

		System.out.println("Horas Trabalhadas no m�s: ");
		horas = sc.nextInt();

		System.out.println("Sal�rio por hora: ");
		salarioHora = sc.nextDouble();

		double custo = horas * salarioHora;
		double salarioBruto = 160 * salarioHora;
		double horaExtra = ((horas - 160) * (salarioHora * 1.50));

		if (horas <= 160) {
			System.out.println("Custo: R$" + custo);

		} else if (horas > 160) {
			System.out.println("Custo: R$" + (salarioBruto + horaExtra));

		}
		sc.close();
	}

}
