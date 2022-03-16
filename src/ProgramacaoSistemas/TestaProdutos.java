
package ProgramacaoSistemas;

public class TestaProdutos {
	
	public static void main (String [] args) {

		Produtos p1 = new Produtos(123, "M");
		System.out.printf("\nCódigo: %d \nDescrição: %s \nPreço: %.2f", p1.codigo, p1.descricao, p1.preco);
		System.out.println("");
		
		p1.descricao = "Camisa"; 
		p1.preco = 100.00;
		p1.atualizaPreco (5);
		
		System.out.printf("\nCódigo: %d \nDescrição: %s \nPreço: %.2f", p1.codigo, p1.descricao, p1.preco);
		System.out.println("");
		
		Produtos p2 = new Produtos (654321, "Calça");
		p2.preco = 200.00;
		p2.atualizaPreco (10);
		
		System.out.printf("\nCódigo: %d \nDescrição: %s \nPreço: %.2f", p2.codigo, p2.descricao, p2.preco);
		
	}

}
