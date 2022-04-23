package exercicios;

import java.lang.Math;
import java.util.Scanner;

/*8) Fa�a um algoritmo que calcule as ra�zes de uma equa��o de 2� grau 
 * (ax2+bx +c=0). Caso o delta seja negativo, informe que n�o � 
 * poss�vel solucionar o problema.
 */

public class Equacao2Grau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int delta;
		double x1;
		double x2;

		System.out.println("a: ");
		a = sc.nextInt();

		System.out.println("b: ");
		b = sc.nextInt();

		System.out.println("c: ");
		c = sc.nextInt();

		delta = (b * b) - (4 * a * c);
		// raizQuadrada = Math.sqrt(delta);

		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);

		if (delta > 0) {
			System.out.print("x1: " + x1);
			System.out.print("\nx2: " + x2);
		
		} else if (delta == 0) {
			System.out.printf("x1 e x2: " + (-b + Math.sqrt(delta)) / 2 * a);
		
		} else {
			System.out.println("Imposs�vel calcular");

		}
	}
}
