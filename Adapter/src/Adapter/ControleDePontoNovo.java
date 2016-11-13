package Adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import src.Funcionario;

//Adaptee
public class ControleDePontoNovo {
	
	// Mesmo método cuidando da entrada e saída de funcionários
	public void registra(Funcionario f, boolean entrada) {
		Calendar calendar = Calendar.getInstance(); SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		
		if (entrada == true) {
		System.out.println("Entrada: " + f.getNome() + " as " + format);
		} else {
		System.out.println("Saida: " + f.getNome() + " as " + format);
		}
	
	}

}
