package ProgramacaoSistemas;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario programador = new Funcionario ("Daniel", 10000);
		System.out.println("Nome: " + programador.nome);
		System.out.println("Salario: " + programador.salario);
		System.out.println("Valor do imposto = " + programador.CalculaImposto());
	}

}
