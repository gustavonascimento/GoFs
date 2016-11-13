package Teste;

import java.util.Calendar;

import ConcreteStrategy.PagamentoCartao;
import ConcreteStrategy.PagamentoDinheiro;
import Context.Mercearia;
import Context.Produtos;
import Strategy.Pagamento;

public class TesteStrategy {

	public static void main(String[] args) {
		Mercearia mercearia;
		
		Produtos vassoura = new Produtos("1", 20.0);
		Produtos mesa = new Produtos("2", 200.0);
		Produtos caderno = new Produtos("3", 15.0);
		Produtos manteiga = new Produtos("1", 5.0);
		
		Pagamento pagamento;
		Calendar date = Calendar.getInstance();
		
		System.out.println("Simulação de pagamento via cartão de crédito");
		mercearia = new Mercearia();
		mercearia.adicionarProduto(vassoura);
		mercearia.adicionarProduto(caderno);
		pagamento = new PagamentoCartao("Gustavo", date);
		mercearia.pagamento(pagamento);
		
		System.out.println("");
		System.out.println("Simulação de pagamento via dinheiro");
		mercearia = new Mercearia();
		mercearia.adicionarProduto(mesa);
		mercearia.adicionarProduto(manteiga);
		pagamento = new PagamentoDinheiro("Gustavo", date);
		mercearia.pagamento(pagamento);

	}

}
