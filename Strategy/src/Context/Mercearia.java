package Context;

import java.util.ArrayList;

import Strategy.Pagamento;

public class Mercearia {
	ArrayList<Produtos> produtos;
	Pagamento pagamento;
	
	public Mercearia() {
		this.produtos = new ArrayList<Produtos>();
	}
	
	public void adicionarProduto(Produtos produto) {
		this.produtos.add(produto);
	}
	
	public void removerProduto(Produtos produto) {
		this.produtos.remove(produto);
	}
	
	public double precoTotal() {
		double soma = 0;
		
		for(Produtos produto : produtos) {
			soma += produto.getPrecoProduto();
		}
		
		return soma;
	}
	
	public void pagamento(Pagamento pagamento) {
		double quantidade = this.precoTotal();
		this.pagamento = pagamento;
		this.pagamento.pagamento(quantidade);
	}
	
}
