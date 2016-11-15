package TestProxy;

import Proxy.ContaProxy;
import RealSubject.ContaReal;
import Subject.Conta;

public class TesteProxy {
	public static void main(String[] args) {
		Conta contaReal = new ContaReal();
		Conta contaProxy = new ContaProxy(contaReal);
		
		contaProxy.deposita(100); 
		contaProxy.saca(59);
		System.out.println("Saldo: " + contaProxy.getSaldo());
		
//		System.out.println("");
//		contaProxy.deposita(200);
//		contaProxy.saca(100);
//		System.out.println("Novo saldo: " + contaProxy.getSaldo());
	}
}
