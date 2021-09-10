package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];
		contas[0] =  new ContaCorrente(1122, 1133);
		contas[1] =  new ContaCorrente(3322, 3333);
		contas[2] =  new ContaCorrente(4422, 4433);
		contas[3] =  new ContaPoupanca(5522, 5533);
		

		System.out.println(contas[0].getNumero());
	}

}
