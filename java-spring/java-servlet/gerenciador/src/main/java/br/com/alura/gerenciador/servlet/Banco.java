package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;

public class Banco {

	// static porque a lista é da classe e não do objeto
	private static ArrayList<Empresa> listaEmpresas = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}
	
	
	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);
		System.out.println(empresa + " adicionada");
	}

	public ArrayList<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}
}
