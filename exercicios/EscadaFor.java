package exercicios;

import java.util.Scanner;

/*15) Ler um número inteiro N e desenhar uma escada com N degraus.*/

public class EscadaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int escada;
		int n = 1;

		System.out.println("Tamanho da escada: ");
		escada = sc.nextInt();

		
		for (int coluna = 1; coluna <= escada; coluna++ ){
				for (int linha = 1; linha <= coluna; linha++)
					System.out.print("*");
		}	
	

		
	}
}
