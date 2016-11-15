package Test;

import Builder.BoletoBuilder;
import ConcreteBuilder.BBBoletoBuilder;
import ConcreteBuilder.ItauBoletoBuilder;
import Director.GeradorDeBoleto;
import Product.Boleto;

public class TestBuilder {
	public static void main(String[] args) {
		
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder); 
		Boleto boleto = geradorDeBoleto.geraBoleto(); 
		System.out.println(boleto);
		
		BoletoBuilder boletoBuilderItau = new ItauBoletoBuilder();
		GeradorDeBoleto geradorDeBoletoItau = new GeradorDeBoleto(boletoBuilderItau); 
		Boleto boleto2 = geradorDeBoletoItau.geraBoleto2();
		System.out.println(boleto2);
	
	}
}
