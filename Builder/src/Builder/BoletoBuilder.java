package Builder;

import java.util.Calendar;

import Product.Boleto;

public interface BoletoBuilder {
	
	void buildSacado(String sacado);
	void buildCedente(String cedente); 
	void buildValor(double valor);
	void buildVencimento(Calendar vencimento); 
	void buildNossoNumero(int nossoNumero);
	void buildPagamentoOnline(boolean pagamentoOnline);
	
	Boleto getBoleto();
	
}
