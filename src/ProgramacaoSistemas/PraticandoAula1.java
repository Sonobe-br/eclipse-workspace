package ProgramacaoSistemas;
import java.util.Scanner;

public class PraticandoAula1 {
	
	public static void main (String[] args) {
		
		double numero1; 
		double numero2;
		
		int operacoes;
		
		Scanner entrada = new Scanner (System.in);
			
			while (true) {
				
				System.out.println ("1 - soma \n 2 - subtra��o \n 3 - Multiplica��o \n 4 - divis�o \n 5 - sair");
				
				operacoes = entrada.nextInt();
				
				if(operacoes == 5);
					break;
				
				if (operacoes < 1 || operacoes > 6) {
					
					System.out.println("Op��o inv�lido");
					continue;

				}
				
				System.out.println("Digite 2 n�meros:");
				
				numero1 = entrada.nextDouble();
				numero2 = entrada.nextDouble();
				
				switch (operacoes) {
				
					operacoes: System.out.println("Soma = " + (numero1 + numero2));
						break;
					case2: System.out.println("Substra��o = " + (numero1 - numero2));
						break;

				}		
						
			}
			
		}
				
	}


