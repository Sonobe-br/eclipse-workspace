package ProgramacaoSistemas;

public class Pedido {
	
	public int numero;
	public Produto item;
	public int quantidade;
	public double valor = 0.0;
	
	public Pedido (int numero, Produto item, int quantidade, double valor) {
		
		this.numero = numero;
		this.item = item;
		this.quantidade = quantidade;
	}
	
	void calculaPedido () {
		
		valor = quantidade * item.preco;
	}
	
	@Override
	public String toString () {
		
		String res;
		
		res = "N�mero do pedido" + numero + "\r\n";
		res += "C�digo do produto" + item.codigo + "\r\n";
		res += "Descri��o: " + item.descricao + "\r\n";
		res += "Pre�o do produto" + item.preco + "\r\n";
		res += "Quantidade" + quantidade + "\r\n";
		
		calculaPedido ();
		
		res += "Valor total do pedido: " + valor + "\r\n";
			
		return res;
		
	}

}
