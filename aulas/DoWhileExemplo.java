package aulas;

import java.util.Scanner;

public class DoWhileExemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroBase = 8;
		String parar = "N";
		int indice = 0;

		do {
			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
			System.out.println("Deseja parar? (S/N)");
			parar = sc.nextLine().toUpperCase();
			indice++;
		
		}while (!parar.equals("S"));
		
		
	}

}
