package ProgramacaoSistemas;

public class Veiculo {
	
	int renavan;
	String nomeVeiculo;
	String proprietario;
	public String novoProprietario;
	int quantidadeDePortas;
	
	
	Veiculo (int renavan, String proprietario) {
		
		this.renavan = renavan;
		this.nomeVeiculo = nomeVeiculo;
		this.proprietario = proprietario;
		this.quantidadeDePortas = quantidadeDePortas;
		this.novoProprietario = novoProprietario;
	}

	public void tranferenciaDeProprietario (String novoProprietario) {
		
		proprietario = novoProprietario; 
			
	}
}
