package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
		System.out.println("Conta adicionada, " + ref);
		System.out.println("Número de contas no BD: " + posicaoLivre);
	}

	public int getQuantidadeDeElemento() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}
}
