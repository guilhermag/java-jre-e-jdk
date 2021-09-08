package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println();
		
		ContaCorrente contaCorrente = new ContaCorrente(22, 33);
		ContaPoupanca contaPoupanca = new ContaPoupanca(33, 22);
		
		System.out.println(contaCorrente);
		System.err.println(contaPoupanca);

	}

}
