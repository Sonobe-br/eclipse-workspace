package ProgramacaoSistemas;

public class TestaFrota {
	
	public static void main (String [] args) {
		
		Carro meuCarro = new Carro(0, null, null, 0);
		meuCarro.proprietario = "Daniel";
		meuCarro.nomeVeiculo = "Ford";
		meuCarro.renavan = 276869784;
		meuCarro.quantidadeDePortas = 4;
		meuCarro.novoProprietario = "Tammy" ;
		System.out.println(meuCarro.toString());
		
		Caminhao meuCaminhao = new Caminhao(0, null, null);	
		meuCaminhao.proprietario = "Pedro";
		meuCaminhao.nomeVeiculo = "Chevrolet";
		meuCaminhao.renavan = 280818168;
		meuCaminhao.quantidadeDeEixos = 5;
		meuCaminhao.novoProprietario = "Anita";
		meuCaminhao.quantidadeDePortas = 2;
		System.out.println(meuCaminhao.toString());
	}

}
