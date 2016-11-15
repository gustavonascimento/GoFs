package ConcreteState;

import State.Cartao;

public class CartaoAmerican implements Cartao{

	@Override
	public double calculaJuros(double total, double imposto) {
		return 0.4 * (total + imposto);
	}

}
