package singleton;

public class AlunoSingleton {
	
	private static AlunoSingleton instance;
	private static int quantidaDeInstancias;
	
	//instancia da classe privada, só ela pode criar objetos AlunoSingleton
	private AlunoSingleton() {
		quantidaDeInstancias++;
	}
	
	public static AlunoSingleton getInstance() {
		if(AlunoSingleton.instance == null) {
			AlunoSingleton.instance = new AlunoSingleton();
		} 
		return AlunoSingleton.instance;
	}
	
	public int quantidadeDeInstancias() {
		return quantidaDeInstancias;
	}
}
