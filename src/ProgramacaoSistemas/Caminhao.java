package ProgramacaoSistemas;

public class Caminhao extends Veiculo {
	
	Caminhao(int renavan, String proprietario, String nomeVeiculo) {
		super(renavan, proprietario);
	}

	int quantidadeDeEixos;
	
	public String toString () {
		
		return "\nPropriet�rio: " + proprietario +
				"\nNovo Propriet�rio: " + novoProprietario +
				"\nNome do Ve�culo: " + nomeVeiculo +
				"\nRENAVAM: " +  renavan +
				"\nQuantidade de Eixos: " + quantidadeDeEixos;
	}

}
