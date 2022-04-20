package ProgramacaoSistemas;

public class Caminhao extends Veiculo {
	
	Caminhao(int renavan, String proprietario, String nomeVeiculo) {
		super(renavan, proprietario);
	}

	int quantidadeDeEixos;
	
	public String toString () {
		
		return "\nProprietário: " + proprietario +
				"\nNovo Proprietário: " + novoProprietario +
				"\nNome do Veículo: " + nomeVeiculo +
				"\nRENAVAM: " +  renavan +
				"\nQuantidade de Eixos: " + quantidadeDeEixos;
	}

}
