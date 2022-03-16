package ProgramacaoSistemas;
import java.util.Scanner;

public class PraticandoAula1 {
	
	public static void main (String[] args) {
		
		double numero1; 
		double numero2;
		
		int operacoes;
		
		Scanner entrada = new Scanner (System.in);
			
			while (true) {
				
				System.out.println ("1 - soma \n 2 - subtração \n 3 - Multiplicação \n 4 - divisão \n 5 - sair");
				
				operacoes = entrada.nextInt();
				
				if(operacoes == 5);
					break;
				
				if (operacoes < 1 || operacoes > 6) {
					
					System.out.println("Opção inválido");
					continue;

				}
				
				System.out.println("Digite 2 números:");
				
				numero1 = entrada.nextDouble();
				numero2 = entrada.nextDouble();
				
				switch (operacoes) {
				
					operacoes: System.out.println("Soma = " + (numero1 + numero2));
						break;
					case2: System.out.println("Substração = " + (numero1 - numero2));
						break;

				}		
						
			}
			
		}
				
	}


