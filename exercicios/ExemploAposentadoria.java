package exercicios;

public class ExemploAposentadoria {

	public static void main(String[] args) {

		int idade = 19;

		if (idade >= 65) {
			System.out.println("Pode se aposentar");

		} else if (idade >= 16 && idade < 65) {
			System.out.println("Vai trabaiá!");

		} else {

			System.out.println("Intrabalhável");
		}

	}

}
