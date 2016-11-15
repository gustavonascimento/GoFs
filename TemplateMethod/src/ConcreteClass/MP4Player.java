package ConcreteClass;

import AbstractClass.Player;

public class MP4Player extends Player{

	@Override
	public void play() {
		System.out.println("Reproduzindo um vídeo em MP4... ");
	}

	@Override
	public void stop() {
		System.out.println("Parando de reproduzir o video MP4... ");
	}

	@Override
	public void forward() {
		System.out.println("Passando para proximo video em MP4... ");
	}

}
