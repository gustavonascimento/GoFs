package Director;

import java.util.Calendar;

import Builder.BoletoBuilder;
import Product.Boleto;

public class GeradorDeBoleto {
	
	private BoletoBuilder boletoBuilder;
	
	public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto() {
		
		this.boletoBuilder.buildSacado("Gustavo Moreira"); 
		this.boletoBuilder.buildCedente("Banco do Brasil"); 
		this.boletoBuilder.buildValor(550.50);
		Calendar vencimento = Calendar.getInstance(); 
		vencimento.add(Calendar.DATE, 30); 
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(1986487629);
		Boleto boleto = boletoBuilder.getBoleto();

		return boleto;
	}
	
	public Boleto geraBoleto2() {
		this.boletoBuilder.buildSacado("Gustavo Moreira"); 
		this.boletoBuilder.buildCedente("Itau"); 
		this.boletoBuilder.buildValor(800.50);
		Calendar vencimento = Calendar.getInstance(); 
		vencimento.add(Calendar.DATE, 30); 
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(1986487629);
		this.boletoBuilder.buildPagamentoOnline(false);
		Boleto boleto2 = boletoBuilder.getBoleto();
		
		return boleto2;
	}
	
}
