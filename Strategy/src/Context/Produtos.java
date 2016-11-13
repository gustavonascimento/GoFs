package Context;

public class Produtos {
	private String codigoProduto;
	private double precoProduto;
	
	public Produtos(String codigoProduto, double precoProduto) {
		this.codigoProduto = codigoProduto;
		this.precoProduto = precoProduto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
}
