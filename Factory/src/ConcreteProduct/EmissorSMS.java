package ConcreteProduct;

import Product.Emissor;

public class EmissorSMS implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem por SMS..... ");
		System.out.println(mensagem);
	}
	
}
