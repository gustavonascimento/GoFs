package Product;

import java.util.Calendar;

public interface Boleto {
	
	// Sacado = Pessoa responsável pelo pagamento do boleto
	String getSacado();
	
	// Sedente = Pessoa ou empresa que receberá o pagamento 
	String getCedente();
	
	double getValor();
	Calendar getVencimento();
	
	//código de identificação do boleto
	int getNossoNumero();
	String toString();

}
