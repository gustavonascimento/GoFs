package Component;

public class Midia {
	
	private static Midia instance;
	
	public static Midia getInstance() {
		if(Midia.instance == null) {
			Midia.instance = new Midia();
		}
		
		return Midia.instance;
	}
	
	public void tipoMidiaDVD() {
		System.out.println("Midia DVD");
	}
	
	public void tipoMidiaCD() {
		System.out.println("Midia cd");
	}
}
