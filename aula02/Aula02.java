package aula02;

public class Aula02 {
	public static void main(String[] args) {

		Caneta c1 = new Caneta();

		c1.cor = "Azul";
		c1.ponta = 0.5;
		//c1.tampada = false;
		c1.modelo = "Bic Crystal";
		
		c1.destampar();
		//c1.status();
		//c1.rabiscar();
		
		Caneta c2 = new Caneta();
		
		c2.cor = "Preta";
		c2.modelo = "Stabilo";
		c2.destampar();
		c2.status();
		c2.rabiscar();

	}
}
