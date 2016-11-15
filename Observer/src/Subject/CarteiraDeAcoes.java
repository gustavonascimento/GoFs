package Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Observer.Observador;

public class CarteiraDeAcoes {
	
	private Map<String,Integer> acoes = new HashMap<>();
    private List<Observador> obs = new ArrayList<>();
    
    public void adicionaAcoes(String acao, Integer quantidade) {
        if(acoes.containsKey(acao)){
        	quantidade += acoes.get(acao);
        }
        acoes.put(acao, quantidade);
        notificar(acao, quantidade);
    }
    private void notificar(String acao, Integer quantidade) {
        for(Observador o: obs)
            o.mudancaQuantidade(acao, quantidade);
}
    public void adicionarObservador(Observador observador) {
        obs.add(observador);
}
	
}
