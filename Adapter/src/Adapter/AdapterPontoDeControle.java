package Adapter;

import src.ControleDePonto;
import src.Funcionario;

public class AdapterPontoDeControle extends ControleDePonto{
	private ControleDePontoNovo controleDePontoNovo;
	
	public AdapterPontoDeControle() {
		this.controleDePontoNovo = new ControleDePontoNovo();
	}
	
	//Adapter
	public void registraEntrada(Funcionario funcionario) {
		this.controleDePontoNovo.registra(funcionario, true);
	}
	
	//Adapter
	public void registraSaida(Funcionario funcionario) {
		this.controleDePontoNovo.registra(funcionario, false);
	}
}
