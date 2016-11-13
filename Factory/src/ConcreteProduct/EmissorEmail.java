package ConcreteProduct;

import Product.Emissor;

public class EmissorEmail implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por email... ");
		System.out.println(mensagem);
	}

}
