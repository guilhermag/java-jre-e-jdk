package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArray {

	public static void main(String[] args) {

		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(11, 22);
		Conta cc2 = new ContaCorrente(22, 33);
		Conta cc3 = new ContaCorrente(44, 55);
		Conta cc4 = new ContaCorrente(55, 66);
		guardadorDeContas.adiciona(cc1);
		guardadorDeContas.adiciona(cc2);
		guardadorDeContas.adiciona(cc3);
		guardadorDeContas.adiciona(cc4);
		
		int tamanho =guardadorDeContas.getQuantidadeDeElemento();
		System.out.println(tamanho);
		

	}

}
