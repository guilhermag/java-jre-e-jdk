package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		lista.add(new ContaCorrente(11, 22));
		lista.add(new ContaCorrente(22, 33));
		lista.add(new ContaCorrente(44, 55));
		lista.add(new ContaCorrente(55, 66));
		Conta contaTeste = new ContaCorrente(11, 22);
		//lista.add(contaTeste);
		
		boolean existe = lista.contains(new ContaCorrente(22, 33));
		
		System.out.println(existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}	
}
