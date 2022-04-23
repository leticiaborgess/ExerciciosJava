package aula02;

public class Caneta {

	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta de cor: " + this.cor );
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tampada: " + this.tampada);
		
	}
	
	void rabiscar() {
		if(this.tampada == true){
			System.out.println("A caneta está tampada!");	
		}else {
			System.out.println("Rabiscando..");
		}

	}
	
	void tampar() {
		
		this.tampada = true;
		
	}

	void destampar() {
		
		this.tampada = false;
		
	}
}
