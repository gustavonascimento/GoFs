package Test;

import ConcreteObserver.AcoesLogger;
import ConcreteObserver.GraficoBarras;
import Subject.CarteiraDeAcoes;

public class TesteObserver {
	public static void main(String[] args) throws InterruptedException {
			
			GraficoBarras gb = new GraficoBarras();
		    AcoesLogger al = new AcoesLogger();
		    CarteiraDeAcoes c = new CarteiraDeAcoes();
		    
		    c.adicionarObservador(gb);
		    c.adicionarObservador(al);
		    
		    Thread.sleep(2000);
		    c.adicionaAcoes("Google", 500);
		    
		    Thread.sleep(2000);
		    c.adicionaAcoes("Apple", 400);
		    
		    Thread.sleep(2000);
		    c.adicionaAcoes("Uber", 350);
		    
		    Thread.sleep(2000);
		    c.adicionaAcoes("Spotify", -200);
		    
		    Thread.sleep(2000);
		    c.adicionaAcoes("Facebook", 150);
	}
}
