package Component;

public class Radio {
	
	private static Radio instance;
	
	public static Radio getInstance() {
		if(Radio.instance == null) {
			Radio.instance = new Radio();
		}
		
		return Radio.instance;
	}
	
	public void radioOn() {
		System.out.println("Radio ligado");
	}
	
	public void radioOff() {
		System.out.println("Radio desligado");
	}

}
