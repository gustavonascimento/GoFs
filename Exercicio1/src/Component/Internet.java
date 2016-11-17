package Component;

public class Internet {
	
	private static Internet instance;
	
	public static Internet getInstance() {
		if(Internet.instance == null) {
			Internet.instance = new Internet();
		}
		
		return Internet.instance;
	}
	
	public void internetLoad() {
		System.out.println("Carregado...");
	}
	
}
