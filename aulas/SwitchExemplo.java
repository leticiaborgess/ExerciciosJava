package aulas;

import java.util.Scanner;

public class SwitchExemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("Qual opção deseja? (1, 2 ou 3)");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Parabéns!1!1!");
			break;
		case 2:
			System.out.println("Parabéns!2!2!");
			break;
		default:
			System.out.println("Opção Inválida!");
		}

	}

}
