package Context;

import State.Cartao;

public class Banco {
	
	private Cartao cartao;
	
	public Banco(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public double calculaJuros(double total, double imposto) {
		return this.cartao.calculaJuros(total, imposto);
	}
}
