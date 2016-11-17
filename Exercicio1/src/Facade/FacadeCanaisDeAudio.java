package Facade;

import Component.Internet;
import Component.Midia;
import Component.Radio;

public class FacadeCanaisDeAudio {
	
	private Radio radio;
	private Midia midia;
	private Internet internet;
		
	public FacadeCanaisDeAudio() {
		this.radio = Radio.getInstance();
		this.midia = Midia.getInstance();
		this.internet = Internet.getInstance();
	}
	
	public void inicializarCanais() {
		radio.radioOn();
		midia.tipoMidiaCD();
		internet.internetLoad();
	}
	
}
