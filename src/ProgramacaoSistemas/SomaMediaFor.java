package ProgramacaoSistemas;

import java.util.Scanner;

public class SomaMediaFor {

	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero, soma = 0;
		
		double media;
		System.out.println("Digite 10 n�meros:");
		
		for (int i = 0; i < 10; i++) {
			
			numero = input.nextInt();
			
			soma += numero;
			
		}
		
		media = (double) soma / 10;
			System.out.println("Soma dos n�meros digitados: " + soma);
			System.out.println("M�dia dos n�meros digitados: " + media);
		
	}
	
}
