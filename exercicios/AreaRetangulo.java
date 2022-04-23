package exercicios;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base;
		int altura;
		
		
		System.out.println("Base: ");
		base = sc.nextInt();
		
		System.out.println("Altura: ");
		altura = sc.nextInt();
		
		int area = (base * altura);
		
		System.out.println("A área é: " + area);

	}

}
