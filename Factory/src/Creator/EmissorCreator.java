package Creator;

import ConcreteProduct.EmissorEmail;
import ConcreteProduct.EmissorSMS;
import ConcreteProduct.EmissorTelegram;
import Product.Emissor;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int TELEGRAM = 2;
	
	public Emissor create(int tipoDeEmissor) {
		if(tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		} else if(tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		} else if(tipoDeEmissor == EmissorCreator.TELEGRAM) {
			return new EmissorTelegram();
		} else {
			throw new IllegalArgumentException("Tipo de Emissor não suportado");
		}
		
	}
	
}	
