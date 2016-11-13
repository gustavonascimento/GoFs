package teste;

import singleton.AlunoSingleton;

public class TesteSingleton {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10000; i++){
			AlunoSingleton aluno = AlunoSingleton.getInstance();
			System.out.println(aluno.quantidadeDeInstancias());
		}
	}
}
