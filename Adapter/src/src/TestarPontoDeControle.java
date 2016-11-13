package src;

import Adapter.AdapterPontoDeControle;

public class TestarPontoDeControle {

	public static void main(String[] args) throws InterruptedException {
		//Instanciação do objeto antigo
		//ControleDePonto controleDePonto = new ControleDePonto();
		
		//Instiação do objeto com o adapter, a única modificação para o usuário é o 
		//new AdapterPontoDeControle(); minimizando os impactos para o cliente.
		ControleDePonto controleDePonto = new AdapterPontoDeControle();
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Gustavo Moreira");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000); controleDePonto.registraSaida(funcionario);
	}

}
