package ProgramacaoSistemas;

public class Carro extends Veiculo {

	Carro(int renavan, String nomeVeiculo, String proprietario, int quantidadeDePortas) {
		super(renavan, proprietario);
		
		
	}

		public String toString () {
			return "\nPropriet�rio: " + proprietario + 
					"\nNovo Propriet�rio: " + novoProprietario + 
					"\nNome do Ve�culo: " + nomeVeiculo +
					"\nRENAVAN: " + renavan + 
					"\nQuantidade de Portas: " + quantidadeDePortas;
					
		
	}
	

}
