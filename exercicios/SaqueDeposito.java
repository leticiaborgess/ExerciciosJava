package exercicios;

public class SaqueDeposito {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular = "Letícia";
		conta1.numero = 12345.6;
		
		conta1.depositar(5000);
		conta1.imprimirSaldo();
		
		
				

	}

}
