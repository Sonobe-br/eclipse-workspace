package ProgramacaoSistemas;

public class Carro extends Veiculo {

	Carro(int renavan, String nomeVeiculo, String proprietario, int quantidadeDePortas) {
		super(renavan, proprietario);
		
		
	}

		public String toString () {
			return "\nProprietário: " + proprietario + 
					"\nNovo Proprietário: " + novoProprietario + 
					"\nNome do Veículo: " + nomeVeiculo +
					"\nRENAVAN: " + renavan + 
					"\nQuantidade de Portas: " + quantidadeDePortas;
					
		
	}
	

}
