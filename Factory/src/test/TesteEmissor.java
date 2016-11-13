package test;

import Creator.EmissorCreator;
import Product.Emissor;

public class TesteEmissor {
	public static void main(String[] args) {
		EmissorCreator creator = new EmissorCreator();
		//SMS
		Emissor emissor1 = creator.create(EmissorCreator.SMS);
		emissor1.envia("Desenho de software");
		
		//Email
		Emissor emissor2 = creator.create(EmissorCreator.EMAIL); 
		emissor2.envia("Desenho de software");
		
		//TELEGRAM
		Emissor emissor3 = creator.create(EmissorCreator.TELEGRAM);
		emissor3.envia("Desenho de software");
	}
}
