package ConcreteClass;

import AbstractClass.Player;

public class MP3Player extends Player{

	@Override
	public void play() {
		System.out.println("Executando uma música em MP3.... ");
	}

	@Override
	public void stop() {
		System.out.println("Parando de tocar a música em MP3... ");
	}

	@Override
	public void forward() {
		System.out.println("Passando de música MP3... ");
	}

}
