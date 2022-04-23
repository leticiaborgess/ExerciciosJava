package exercicios;

import java.util.Scanner;
/* Uma empresa quer verificar se um empregado está 
qualificado para a aposentadoria ou não.
 Para estar em condições, um dos seguintes
  requisitos deve ser satisfeito: 

- Ter no mínimo 65 anos de idade. 
- Ter trabalhado no mínimo 30 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos. 

Com base nas informações acima, faça um algoritmo que leia: 
o número do empregado (código), o ano de seu nascimento 
e o ano de seu ingresso na empresa. O programa deverá escrever 
a idade e o tempo de trabalho do empregado e a mensagem 
'Requerer aposentadoria' ou 'Não requerer'.
*/

public class RequererAposentadoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo;
		int anoNasc;
		int anoIngr;
		int idade;
		int tempoTrab;

		System.out.println("Código do Funcionário: ");
		codigo = sc.nextInt();

		System.out.println("Ano de Nascimento: ");
		anoNasc = sc.nextInt();

		System.out.println("Ano de ingresso na empresa: ");
		anoIngr = sc.nextInt();

		idade = 2022 - anoNasc;
		tempoTrab = 2022 - anoIngr;

		if (idade >= 60 && tempoTrab >= 25) {
			System.out.println("Idade: " + idade);
			System.out.println("\nTempo de trabalho: " + tempoTrab);
			System.out.println("Requerer aposentadoria!");

		} else {
			if (idade >= 65 || tempoTrab >= 30) {
				System.out.println("\nIdade: " + idade);
				System.out.println("Tempo de trabalho: " + tempoTrab);
				System.out.println("Requerer aposentadoria!");
			
			} else {
				System.out.println("\nIdade: " + idade);
				System.out.println("Tempo de trabalho: " + tempoTrab);
				System.out.println("Não requerer!");
			}
		}

	}
}
