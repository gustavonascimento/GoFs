package ConcreteProduct;

import Product.Emissor;

public class EmissorTelegram implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem pelo Telegram... ");
		System.out.println(mensagem);
	}

}
