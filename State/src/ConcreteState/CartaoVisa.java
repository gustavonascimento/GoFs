package ConcreteState;

import State.Cartao;

public class CartaoVisa implements Cartao{

	@Override
	public double calculaJuros(double total, double imposto) {
		return 0.5 * (total + imposto);
	}

}
