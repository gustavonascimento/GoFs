package Test;

import AbstractClass.Player;
import ConcreteClass.MP3Player;
import ConcreteClass.MP4Player;

public class TestTemplateMethod {
	public static void main(String[] args) {
		
		Player vlc = new MP3Player();
		vlc.execute();
		
		System.out.println("");
		
		vlc = new MP4Player();
		vlc.execute();
		
	}
}
