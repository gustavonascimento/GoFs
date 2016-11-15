package Test;

import ConcreteState.CartaoAmerican;
import ConcreteState.CartaoVisa;
import Context.Banco;
import State.Cartao;

public class TesteState {
	public static void main(String[] args) {
		Cartao visa = new CartaoVisa();
		Cartao american = new CartaoAmerican();
		
		Banco banco = new Banco(visa);
		
		double valorVisa = banco.calculaJuros(200, 20);
		System.out.println("Valor do imposto no cartao visa: " + valorVisa);
		
		banco.setCartao(american);
		double valorAmerican = banco.calculaJuros(200, 20);
		System.out.println("Valor do imposto no cartao american: " + valorAmerican);
	}
}
