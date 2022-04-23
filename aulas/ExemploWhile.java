package aulas;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroBase = 8;
		String parar = "N";
		int indice = 0;
		
		
		//para comparar strings usar: .equals
		//enquanto parar for diferente de "s"
		while(!parar.equals("S")) {
			System.out.println(numeroBase + " x " + indice + " = " + (numeroBase * indice));
			System.out.println("Deseja parar? (S/N)");
			
			parar = sc.nextLine().toUpperCase();
			indice++;
		}
	}

}
