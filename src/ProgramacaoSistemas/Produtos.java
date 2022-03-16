package ProgramacaoSistemas;

public class Produtos {
	
	int codigo;
	String descricao;
	double preco;
	
	Produtos (int cod, double preco) {
		codigo = cod; 
	}

	Produtos (int codigo, String descricao) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		
	}
	
	public void atualizaPreco (double porcentagem) {
		
		preco = preco + preco * porcentagem / 100;
		
	}
	
}
