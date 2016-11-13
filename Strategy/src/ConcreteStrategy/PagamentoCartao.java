package ConcreteStrategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import Strategy.Pagamento;

public class PagamentoCartao implements Pagamento{
	
	private String nomeCliente;
	private String dataPagamento;
	private String desconto = "0";
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public PagamentoCartao(String nomeCliente, Calendar dataPagamento) {
		this.nomeCliente = nomeCliente;
		this.dataPagamento = simpleDateFormat.format(dataPagamento.getTime());
		
	}
	
	@Override
	public void pagamento(double quantidade) {
		double quantidadeFormatada = Double.valueOf(String.format(Locale.UK,  "%.2f", quantidade));
		System.out.println(quantidadeFormatada + " pago com cartao de credito");
		System.out.println("Nome do cliente: " + this.nomeCliente);
		System.out.println("Data do pagamento: " + this.dataPagamento);
		System.out.println("Desconto: " + this.desconto);
		
	}
	
}
