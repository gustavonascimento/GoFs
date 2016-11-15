package ConcreteBuilder;

import java.util.Calendar;

import Builder.BoletoBuilder;
import Product.Boleto;
import Product.ItauBoleto;

public class ItauBoletoBuilder implements BoletoBuilder{
	
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento; 
	private int nossoNumero;
	private boolean pagamentoOnline;
	
	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;	
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public void buildNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	
	public void buildPagamentoOnline(boolean pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}

	@Override
	public Boleto getBoleto() {
		return new ItauBoleto(sacado, cedente, valor, vencimento, nossoNumero, pagamentoOnline);
	}

}
