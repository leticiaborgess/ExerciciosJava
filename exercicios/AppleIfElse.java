package exercicios;

import java.util.Scanner;

/*As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia,
 *  e R$ 1,00 se forem compradas pelo menos 12.
 *   Escreva um programa que leia o n�mero de ma��s compradas, 
 *   calcule e escreva o custo total da compra.
 */

public class AppleIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maca;

		System.out.println("Quantas ma��s foram compradas? ");
		maca = sc.nextInt();

		if (maca < 12) {
			System.out.println("O valor total �: R$" + maca * 1.3);
		} else {
			System.out.println("O valor total �: R$" + maca * 1.0);
		}
	}
}
